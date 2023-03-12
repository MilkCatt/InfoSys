package piano;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.Pitch;

public class PianoMachine {
	
	private Midi midi;

    ArrayList<Pitch> current_pitch = new ArrayList<>();
    Instrument instrument = Instrument.PIANO;
    int transpose_by = 0;


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
        if (!current_pitch.contains(rawPitch)) {
            current_pitch.add(rawPitch);
            midi.beginNote(rawPitch.transpose(transpose_by).toMidiFrequency(),instrument);
        }
    }

    public void endNote(Pitch rawPitch) {
        if (current_pitch.contains(rawPitch)) {
            current_pitch.remove(rawPitch);
            midi.endNote(rawPitch.transpose(transpose_by).toMidiFrequency(),instrument);
        }
    }

    public void changeInstrument() {
       	instrument = instrument.next();
    }
    
    //TODO write method spec
    public void shiftUp() {
        if (transpose_by <= 24) {
            transpose_by += 12;
        }
    }
    
    //TODO write method spec
    public void shiftDown() {
        if (transpose_by >= 24) {
            transpose_by -= 12;
        }
    }
    
    //TODO write method spec
    public boolean toggleRecording() {
    	return false;
    	//TODO: implement for question 4
    }
    
    //TODO write method spec
    public void playback() {    	
        //TODO: implement for question 4
    }

}
