package com.ibanfirst.exercices;

public class MyFormaterApplication {

    public static void main(String[] args) {
        format("type=A\ncontent=Lorem ipsum dolor sit amet.");
        // Input is: type=A
        // content=Lorem ipsum dolor sit amet.
        // Type is: A
        // Content is: Lorem ipsum dolor sit amet.
        // Output is: Loremipsumdolorsitamet

        format("type=\ncontent=Lorem ipsum dolor sit amet.");
        // Input is: type=
        // content=Lorem ipsum dolor sit amet.
        // Type is: Default
        // Content is: Lorem ipsum dolor sit amet.
        // Output is: .tema tis rolod muspi meroL
    }

    public static void format(String input) {
        System.out.println("Input is: " + input);
        System.out.println("Type is " + getType(input));
        System.out.println("Content is " + getContent(input));

        String type = getType(input);
        String output = new String();
        if (type == "A") {
            output = formatAType(getContent(input));
        } else {
            output = formatDefaultType(getContent(input));
        }

        System.out.println("Output is: " + output);
    }

    public static String getType(String s) {
        // Should parse the input and return the type
        return s;
    }

    public static String getContent(String input) {
        // Should parse the input and return the content
        return input;
    }

    public static String formatAType(String input) {
        // should remove space, coma, point
        return input;
    }

    public static String formatDefaultType(String content) {
        // should reverse the string
        return content;
    }
}
