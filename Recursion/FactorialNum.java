package com.souvik.Day37;

public class FactorialNum {

    public static void main(String[] args) {

        System.out.println(factorial(6));
    }

    public static int factorial(int n)
    {
//        base case
        if( n == 1)
        {
            return 1;
        }

        return n* factorial(n-1);
    }
}
