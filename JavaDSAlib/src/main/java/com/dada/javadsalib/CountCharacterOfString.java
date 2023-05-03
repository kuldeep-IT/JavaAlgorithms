package com.dada.javadsalib;

public class CountCharacterOfString {

    //aaabbccccdeeffg

    public static void main(String[] args) {
        System.out.println(comparison("aabbccccdeeffg"));
    }

    public static String comparison(String s) {
        //stored first character of string
        String stringValue = s.charAt(0) + "";
        int count = 1;


        for (int i = 1; i < s.length(); i++) {
            String current = s.charAt(i) + "";
            String prev = s.charAt(i - 1) + "";

            if (current.equals(prev)) {
                count += 1;
            } else {
                if (count > 1) {
                    stringValue += count;
                    count = 1;
                }

                stringValue += current;
            }

        }

        if (count > 1) {
            stringValue += count;
            count = 1;
        }

        return stringValue;
    }

}
