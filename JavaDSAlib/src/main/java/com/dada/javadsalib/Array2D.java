package com.dada.javadsalib;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        // print 2d array

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the how much rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        //first loop is for the row
        for (int i = 0; i < n; i++) {
            //second loop is for the column
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //for the print all the array
        for(int i=0; i< arr.length; i++){
            for (int j=0; j< arr[0].length; j++){
                System.out.println("position of i "+i+" and j "+j +": " +arr[i][j]);
            }
            System.out.println();
        }

    }

}
