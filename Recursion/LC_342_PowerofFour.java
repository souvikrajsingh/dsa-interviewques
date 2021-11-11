package com.souvik.Day40;

//https://leetcode.com/problems/power-of-four/

public class LC_342_PowerofFour {

    public static void main(String[] args) {
        System.out.println(poweroffour(10));
    }

    public static boolean poweroffour(int n)
    {
        if( n == 0)
        {
            return false;
        }
        if(n == 1)
        {
            return true;
        }
        if(n%4 == 1)
        {
            return false;
        }
        return poweroffour(n/4);
    }
}
