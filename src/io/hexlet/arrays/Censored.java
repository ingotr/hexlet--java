package io.hexlet.arrays;

import java.util.StringJoiner;

public class Censored {
    public static void main(String[] args) {
        var text1 = "When you play the game of thrones, you win or you die";
        String[] stopWords1 = {"die", "play"};
        var result1 = Censored.makeCensored(text1, stopWords1);
        System.out.println(result1);

        var text2 = "chicken chicken? chicken! chicken";
        String[] stopWords2 = {"?", "chicken"};
        var result2 = Censored.makeCensored(text2, stopWords2);
        System.out.println(result2);
    }

    public static String makeCensored(String text, String[] stopWords) {
        String[] words = text.split(" ");
        String censor = "$#%!";

        for (int i = 0; i < words.length; i++) {
            for (String sw: stopWords) {
                if (sw.equals(words[i])) {
                    words[i] = censor;
                    break;
                }
            }
        }

        return String.join(" ", words);
    }
}
