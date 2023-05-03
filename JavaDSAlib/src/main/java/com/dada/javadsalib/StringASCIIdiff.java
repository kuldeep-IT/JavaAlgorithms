package com.dada.javadsalib;

import java.util.Scanner;

public class StringASCIIdiff {

    public static String solution(String s){
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        for(int i = 1; i< s.length(); i++){
            char current = s.charAt(i);
            char prev = s.charAt(i -1);

            int gap = current - prev;

            sb.append(gap);
            sb.append(current);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }

}
