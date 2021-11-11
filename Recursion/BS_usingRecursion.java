package com.souvik.Day37;

public class BS_usingRecursion {

    public static void main(String[] args) {

        int []  arr = { 1,2,3,4,5,6};
        int target = 5;

        System.out.println(binarysearch(arr,target,0,arr.length - 1));
    }

    static int binarysearch(int[] arr, int target, int s, int e) {
        if(s > e)
        {
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target)
        {
            return m;
        }
        if(target > arr[m])
        {
            return binarysearch(arr, target, m + 1 , e);
        }

        return binarysearch(arr,target,s,m-1);

    }
}
