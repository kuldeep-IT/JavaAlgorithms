package com.dada.javadsalib;

public class PalindromeNumberL {

    public static void main(String[] args) {

        //wrong solution
        System.out.println("Is palindrome :" + isPalindrome(12221));

        //right solution
        System.out.println("Is palindrome2 :" + isPalindrome2(555777));

    }

    //wrong solution
    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);

        int firstIndex = 0;
        int lastIndex = s.length() - 1;

        for (int i = firstIndex; i < s.length(); i++) {

            for (int j = lastIndex; j >= i; j--) {

                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                } else {
                    i++;
                    j--;
                }

            }

        }

        return true;
    }

    public static boolean isPalindrome2(int x) {

        int number = x;
        int temp = number;

        int rev = 0;
        int rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == number){
            return true;
        } else {
            return false;
        }
    }

}
