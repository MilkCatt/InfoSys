package PSet1B;


import static PSet1B.Main.BASIC_ALPHABET;

import java.util.*;

public class AlphabetGenerator {
    /**
     * Given a numeric base, return a char[] that maps every digit that is
     * representable in that base to a lower-case char.
     * 
     * This method will try to weight each character of the alphabet
     * proportional to their occurrence in words in a training set.
     * 
     * This method should do the following to generate an alphabet:
     *   1. Count the occurrence of each character a-z in trainingData.
     *   2. Compute the probability of each character a-z by taking
     *      (occurrence / total_num_characters).
     *   3. The output generated in step (2) is a PDF of the characters in the
     *      training set. Convert this PDF into a CDF for each character.
     *   4. Multiply the CDF value of each character by the base we are
     *      converting into.
     *   5. For each index 0 <= i < base,
     *      output[i] = (the first character whose CDF * base is > i)
     * 
     * A concrete example:
     * 	 0. Input = {"aaaaa..." (302 "a"s), "bbbbb..." (500 "b"s),
     *               "ccccc..." (198 "c"s)}, base = 93
     *   1. Count(a) = 302, Count(b) = 500, Count(c) = 198
     *   2. Pr(a) = 302 / 1000 = .302, Pr(b) = 500 / 1000 = .5,
     *      Pr(c) = 198 / 1000 = .198
     *   3. CDF(a) = .302, CDF(b) = .802, CDF(c) = 1
     *   4. CDF(a) * base = 28.086, CDF(b) * base = 74.586, CDF(c) * base = 93
     *   5. Output = {"a", "a", ... (29 As, indexes 0-28),
     *                "b", "b", ... (46 Bs, indexes 29-74),
     *                "c", "c", ... (18 Cs, indexes 75-92)}
     * 
     * The letters should occur in lexicographically ascending order in the
     * returned array.
     *   - {"a", "b", "c", "c", "d"} is a valid output.
     *   - {"b", "c", "c", "d", "a"} is not.
     *   
     * If base >= 0, the returned array should have length equal to the size of
     * the base.
     * 
     * If base < 0, return null.
     * 
     * If a String of trainingData has any characters outside the range a-z,
     * ignore those characters and continue.
     * 
     * @param base A numeric base to get an alphabet for.
     * @param trainingData The training data from which to generate frequency
     *                     counts. This array is not mutated.
     * @return A char[] that maps every digit of the base to a char that the
     *         digit should be translated into.
     */
    
    public static char[] generateFrequencyAlphabet(int base,
                                                   String[] trainingData) {
        if (base < 0) {
            return null;
        }
        if (base == 0) {
            char[] empty = {};
            return empty;

        }

        // Creates a charMap in the form {a:0, b:0, c:0, d:0, ...}
        // in preparation to populate the charMap
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (char i : BASIC_ALPHABET) {
            charMap.put(i,0);
        }
        // Initialise an integer for total_chars for the denominator
        int total_chars = 0;
        // For each character (stored as a string) in the trainingData,
        // add 1 to the corresponding entry in the charMap
        for (String str : trainingData) {
            // Iterate through the characters in the charMap hashmap
            // and see if it fits into any of the boxes
            for (int i = 0; i < str.length(); i++) {
                // If the charMap contains the key that we are iterating through
                // then we add it to the charMap
                // charMap = {a:0, b:0, c:0, d:0, ...}
                // trainingData = {"a", "a", "a", "b", "c", "d", "e", "f"};
                // str = "a" -> str = "a" -> ... -> str = "c" -> str = "d"

                if(charMap.containsKey(str.charAt(i))) {
                    // If the charMap contains a key of the specified character, we add 1 to the
                    // entry in the charMap
                    total_chars += 1;
                    // str.charAt(i) is the character as given in the trainingData -> key
                    // charMap.get(str) -> the current value of the key
                    // then we add 1
                    // Since overwrites the value at the key, we use this method to
                    // increment the value
                    charMap.put(str.charAt(i), charMap.get(str.charAt(i))+1);
                }
            }
        }

        // Gives us a charMap that is the cdf multiplied by the base
        Map<Character, Double> charMap_cdf_base = new HashMap<>();
        double previous = 0;
        for (char character: BASIC_ALPHABET) {
            // get a pdf value of each character
            double pdf = (double) charMap.get(character) / (double) total_chars;
            double cdf = pdf + previous;
            double cdf_base = cdf * base;
            charMap_cdf_base.put(character, cdf_base);
            previous = cdf;
        }

        // Create an array that is the length of the base
        char[] output = new char[base];
        // Loop over the whole return array
        // Check if the value in the hashMap is greater than the iterable
        for (int output_index = 0; output_index < base; output_index++) {
            for (char character: BASIC_ALPHABET) {
                double character_value = Math.ceil(charMap_cdf_base.get(character));
                if (character_value > output_index) {
                    output[output_index] = character;
                    break;
                }
            }
        }
        return output;
    }

}
