package com.souvik.Day37;

//https://www.geeksforgeeks.org/sum-triangle-from-array/

import java.util.Arrays;

public class GFG_SumTriangle {

    public static void main(String[] args) {

        int[] arr= { 1,2,3,4,5};
        sumoftriangle(arr);
    }

    public static void sumoftriangle(int [] arr)
    {
        if( arr.length < 1)
        {
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i+1];
            temp[i] = sum;
        }
        sumoftriangle(temp);
        System.out.println(Arrays.toString(arr));
    }

}
