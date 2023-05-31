package com.dada.javadsalib;

public class TwoSumL {

    public static void main(String[] args) {

//        int[] a = {3,2,3};
        int[] a = {2, 7, 11, 15};
        System.out.println("Your Response: " + twoSum(a, 9).toString());

    }

   /* public static int[] twoSum(int[] nums, int target) {

        int[] list = new int[2];
        boolean isResult = false;

        int lastIndex = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {

//            System.out.println("first index value "+nums[i]);
            System.out.println("second index value " + nums[nums.length - 1]);

            if (nums.length-1 != nums.length-1  ) {

                if (nums[i] + nums[i + 1] == target) {
                    list[0] = i;
                    list[1] = i + 1;

                    isResult = true;

                    break;
                }
            }
        }
        return list;
    }*/

    public static int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];

        for(int x=0; x<nums.length; x++){
            for (int y=0; y<nums.length; y++){
                if (x != y && (nums[x] + nums[y] == target)){
                    list[0] = x;
                    list[1] = y;
                    return list;
                }
            }
        }
        return list;
    }

}

