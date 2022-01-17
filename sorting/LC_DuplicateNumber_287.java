package com.souvik.REV;


//https://leetcode.com/problems/find-the-duplicate-number/
//Amazon Question / Microsoft

public class LC_DuplicateNumber_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,5};
        int dup = findDuplicate(nums);
        System.out.println(dup);
    }
    public static int findDuplicate(int[] nums) {
        int i= 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums, i , correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return nums[index];
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
