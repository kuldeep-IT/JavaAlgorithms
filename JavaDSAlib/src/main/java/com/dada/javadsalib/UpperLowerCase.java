package com.dada.javadsalib;

import java.util.Scanner;

public class UpperLowerCase {

    /*
     * formula
     * 'p' - 'a' = 'P' - 'A'
     *
     * 'p' = 'a' + 'P' - 'A'
     * so, lc = 'a' + uc - 'A'
     *
     * 'P' = 'A' + 'p' - 'a'
     * so, uc = 'A' + lc - 'a'
     *
     * */

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = sb.charAt(i);

            //small character
            if (ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a');
                sb.setCharAt(i, uch);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lch = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(toggleCase(str));
    }
}
