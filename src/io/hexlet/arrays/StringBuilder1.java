package io.hexlet.arrays;

public class StringBuilder1 {
    public static void main(String[] args) {
        String[] items = {"milk", "butter", "bread"};
        String result = StringBuilder1.buildList(items);
        System.out.println(result);
        String result2 = StringBuilder1.buildList2(items);
        System.out.println(result2);
    }

    public static String buildList(String[] items) {
        var result = "<ul>";
        for (var item : items) {
            result = result + "<li>" + item + "</li>";
        }
        result = result + "</ul>";

        return result;
    }

    public static String buildList2(String[] items) {
        var result = new StringBuilder();
        result.append("<ul>");
        for (var item : items) {
            result.append("<li>");
            result.append(item);
            result.append("</li>");
        }
        result.append("</ul>");
        return result.toString();
    }
}
