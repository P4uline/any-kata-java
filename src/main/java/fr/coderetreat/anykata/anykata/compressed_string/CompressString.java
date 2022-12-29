package fr.coderetreat.anykata.anykata.compressed_string;

import java.util.LinkedList;

public class CompressString {
    public String compress(String str) {

        // Init
        char previous = str.charAt(0);
        char current = str.charAt(0);
        int count = 1;
        LinkedList<Character> resultList = new LinkedList<>();

        // Start the loop from 1
        for (int i = 1; i < str.length(); i++) {
            current = str.charAt(i);
            if (current == previous) {
                count ++;
            } else {
                // When the character changes, write the previous and its count in the result.
                addCharacterAndCount(resultList, previous, count);
                count = 1; // Set the counter to 1 for the new character.
            }
            if (resultList.size() >= str.length()) {
                // If the result size is bigger than the original string size, return the original string size.
                return str;
            }
            previous = current;
        }

        // The last element
        addCharacterAndCount(resultList, current, count);
        System.out.println(previous + "" + count);

        StringBuilder sb = new StringBuilder();
        resultList.forEach(c -> sb.append(c));
        return sb.toString();
    }

    private static void addCharacterAndCount(LinkedList<Character> resultList, char character, int count) {
        resultList.add(character);
        resultList.add(String.valueOf(count).charAt(0));
    }
}
