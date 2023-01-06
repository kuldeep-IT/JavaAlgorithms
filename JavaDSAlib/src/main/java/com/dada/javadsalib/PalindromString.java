package com.dada.javadsalib;


/*
 * abccbc
 *
 * */
public class PalindromString {

    public static void main(String[] args) {

        String s = "abccbc";
        System.out.println("Length of the abccbc is " + s.length());

        System.out.println("Pyramid Strings: ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));

                String pyramidString = s.substring(i,j);

                PalindromString p = new PalindromString();
                if(p.isPalindrome(pyramidString)){
                    System.out.println("Palindrome String is: "+pyramidString);
                }

            }
        }
    }

    public Boolean isPalindrome(String s){
        //N A M A N
        //i       j

        //i is start with the first index of the String
        //j is start with the last index of the string
        //now match

        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            } else {
              i++;
              j--;
            }
        }

        return true;
    }

}
