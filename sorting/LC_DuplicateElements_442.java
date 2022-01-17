package com.souvik.REV;

import java.util.ArrayList;
import java.util.List;

public class LC_DuplicateElements_442 {
    public static void main(String[] args) {
        int[] nums = {1,3,1,4,2,2};
        ArrayList<Integer> list = new ArrayList<>();
        list = (ArrayList<Integer>) findDuplicate(nums);
        System.out.println(list);
    }
    public static List<Integer> findDuplicate(int[] nums) {
        ArrayList<Integer> dup = new ArrayList<>();
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
                dup.add(nums[index]);
            }
        }
        return dup;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

