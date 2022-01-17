package com.souvik.REV;


//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Google Question

import java.util.ArrayList;
import java.util.List;

public class LC_DissappearedNumbers_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = new ArrayList<>();
        list = (ArrayList<Integer>) findDisappearedNumbers(nums);
        System.out.println(list);

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> dis = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                dis.add(index + 1);
            }
        }
        return dis;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
