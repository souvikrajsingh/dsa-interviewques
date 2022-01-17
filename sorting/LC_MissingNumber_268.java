package com.souvik.REV;


//https://leetcode.com/problems/missing-number/
//Amazon Question

import java.util.Arrays;

public class LC_MissingNumber_268 {
    public static void main(String[] args) {
        int[] arr = {1,0,3,2};
        int n = missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing number: " + n);
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
         while(i < nums.length){
             int correct = nums[i];
             if( nums[correct] != nums[i]){
                 swap(nums, i , correct);
             }
             else
             {
                 i++;
             }
         }
         
//         search for the first missing number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
