package com.dada.javadsalib;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromList {

    public static boolean isPrime(int n) {
        //prime number is divided by itself and divided by the 1

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void removePrimeList(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            int val = arr.get(i);

            if (isPrime(val) == true) {
                arr.remove(i);
            }

        }
    }


    public static void main(String[] args) {
        //take array from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you want to add number of array");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        removePrimeList(al);
        System.out.println("Final arrayList is: " + al);
    }

}
