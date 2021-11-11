package com.souvik.Day40;

//https://leetcode.com/problems/power-of-three/

public class LC_326_Power_ofThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }
    public static boolean isPowerOfThree(int n) {
        if(n == 0) // we know even 3^0 = 1
        {
            return false;
        }
        if( n == 1) //3^0 = 1
        {
            return true;
        }
        if(n%3 == 1 )
        {
            return false;
        }
        return isPowerOfThree(n/3);
    }

}
