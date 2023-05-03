package com.dada.javadsalib;

public class isPrimeNumber {

    public static void main(String[] args) {
        if (isPrime(17) == true) {
            System.out.println("it's prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
