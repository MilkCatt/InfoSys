package PSet1B;

public class AlphabetGeneratorTest {
    static int base = 26;
    static String[] trainingData = {"abd", "a", "a", "b", "c", "d", "e", "fg"};

    public static void main(String[] args) {
        char[] output = AlphabetGenerator.generateFrequencyAlphabet(base, trainingData);
        System.out.println(output);
    }
}