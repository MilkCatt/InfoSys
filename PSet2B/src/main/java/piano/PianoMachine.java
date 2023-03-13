package piano;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;

public class PianoMachine {
	
	private Midi midi;

    ArrayList<Pitch> current_pitch = new ArrayList<>();
    Instrument instrument = Instrument.PIANO;
    int transpose_by = 0;
    boolean record_state = false;
    ArrayList<NoteEvent> record_list = new ArrayList<>();
    long record_start;


    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }

    public void beginNote(Pitch rawPitch) {
        if (!current_pitch.contains(rawPitch.transpose(transpose_by))) {
            current_pitch.add(rawPitch.transpose(transpose_by));
            midi.beginNote(rawPitch.transpose(transpose_by).toMidiFrequency(),instrument);
            if (record_state){
                long record_time = System.currentTimeMillis() - record_start;
                record_list.add(new NoteEvent(rawPitch,record_time,instrument, NoteEvent.Kind.start));
            }
        }
    }

    public void endNote(Pitch rawPitch) {
        if (current_pitch.contains(rawPitch.transpose(transpose_by))) {
            current_pitch.remove(rawPitch.transpose(transpose_by));
            midi.endNote(rawPitch.transpose(transpose_by).toMidiFrequency(),instrument);
            if (record_state) {
                long record_time = System.currentTimeMillis() - record_start;
                record_list.add(new NoteEvent(rawPitch, record_time, instrument, NoteEvent.Kind.stop));
            }
        }
    }

    public void changeInstrument() {
       	instrument = instrument.next();
    }

    public void shiftUp() {
        if (transpose_by <= 24) {
            transpose_by += 12;
        }
    }

    public void shiftDown() {
        if (transpose_by >= -24) {
            transpose_by = transpose_by-12;
        }
    }

    // NoteEvent(Pitch pitch, long time, Instrument instr, Kind kind)

    public boolean toggleRecording() {
        if (record_state == false){
            record_state = true;
            record_start = System.currentTimeMillis();
            return true;
        }
        else{
            record_state = false;
            return false;
        }
    }

    public void playback2() {
        long time_skip = 0;
        for (NoteEvent i : record_list){
            if (time_skip == 0) {
                time_skip = i.getTime();
            }

            else {
                try{
                    Thread.sleep(i.getTime() - time_skip);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                finally {
                    time_skip = i.getTime();
                }
            }
            Pitch pitch = i.getPitch();
            if (i.getKind() == NoteEvent.Kind.start) {
                midi.beginNote(pitch.toMidiFrequency(), i.getInstr());
            }
            else{
                midi.endNote(pitch.toMidiFrequency(), i.getInstr());
            }
        }
    }

    public void playback() {
        long time_elapsed = 0;
        for (NoteEvent i : record_list){
            long note_timestamp = i.getTime();
            long time_diff = note_timestamp-time_elapsed;
            if (time_elapsed == 0) {
                time_elapsed = note_timestamp;
            }
            else if ((time_diff) != 0) {
                try {
                    Thread.sleep(time_diff);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    time_elapsed = note_timestamp;
                }
            }
            Pitch pitch = i.getPitch();
            if (i.getKind() == NoteEvent.Kind.start) {
                midi.beginNote(pitch.toMidiFrequency(), i.getInstr());
            }
            else{
                midi.endNote(pitch.toMidiFrequency(), i.getInstr());
            }
        }
    }

}
