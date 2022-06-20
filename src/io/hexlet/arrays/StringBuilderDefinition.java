package io.hexlet.arrays;

public class StringBuilderDefinition {
    public static void main(String[] args) {
        String[][] definitions1 = {};
        System.out.println(StringBuilderDefinition.buildDefinitionList(definitions1));

        String[][] definitions2 = {
                {"key", "value"},
                {"key2", "value2"},
        };
        System.out.println(StringBuilderDefinition.buildDefinitionList(definitions2));
    }

    public static String buildDefinitionList(String[][] definitions) {
        if (definitions.length == 0) {
            return "";
        }

        var result = new StringBuilder();
        result.append("<dl>");
        for (var definition : definitions) {
            var name = definition[0];
            var description = definition[1];

            result.append("<dt>");
            result.append(name);
            result.append("</dt>");

            result.append("<dd>");
            result.append(description);
            result.append("</dd>");
        }
        result.append("</dl>");
        return result.toString();
    }
}
