package com.ibanfirst.exercices;

public class MyFormaterApplication {

    public static void main(String[] args) {
        String input = "type=A\ncontent=Lorem ipsum dolor sit amet.";
        System.out.println("Input is: " + input);
        System.out.println("Type is " + getType(input));
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
