package io.hexlet.arrays;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

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
    }

    public static int countUniqChars(String text) {
        if (text.length() == 0) {
            return 0;
        }
        if (text.length() == 1) {
            return 1;
        }

        String[] chars = text.split("");
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
        }
        return count;
    }
}
