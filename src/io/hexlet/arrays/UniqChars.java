package io.hexlet.arrays;

import java.util.HashSet;

public class UniqChars {
    public static void main(String[] args) {
        String text1 = "yyab";
        System.out.println(UniqChars.countUniqChars(text1)); // 3

        String text2 = "You know nothing Jon Snow";
        System.out.println(UniqChars.countUniqChars(text2)); // 13

        String text3 = "";
        System.out.println(UniqChars.countUniqChars(text3)); // 0

        String text4 = "Fear cuts deeper than swords.";
        System.out.println(UniqChars.countUniqChars(text4)); // 16

        String text5 = "yyab";
        System.out.println(UniqChars.cntDistinct(text5)); // 3

        String text6 = "You know nothing Jon Snow";
        System.out.println(UniqChars.cntDistinct(text6)); // 13

        String text7 = "";
        System.out.println(UniqChars.cntDistinct(text7)); // 0

        String text8 = "Fear cuts deeper than swords.";
        System.out.println(UniqChars.cntDistinct(text8)); // 16
    }

    public static int countUniqChars(String text) {
        if (text.length() == 0) {
            return 0;
        }
        if (text.length() == 1) {
            return 1;
        }

        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < text.length(); i++) {
            isItThere[text.charAt(i)] = true;
        }

        int count = 0;
        for (boolean b : isItThere) {
            if (b) {
                count++;
            }
        }

        /*String[] chars = text.split("");
        System.out.println(Arrays.toString(chars));
        int count = 0;

        String key = chars[0];
        boolean isRepeat = false;
        for (int i = 0; i < chars.length; i++) {
            if (ArrayUtils.contains(chars, key) && !isRepeat) {
                count++;
                isRepeat = true;
            } else {
                isRepeat = false;
            }
            key = chars[i];
        }*/
        return count;
    }

    static int cntDistinct(String str) {

        // Set to store unique characters
        // in the given string
        HashSet<Character> s = new HashSet<Character>();

        // Loop to traverse the string
        for(int i = 0; i < str.length(); i++)
        {

            // Insert current character
            // into the set
            s.add(str.charAt(i));
        }

        // Return Answer
        return s.size();
    }
}
