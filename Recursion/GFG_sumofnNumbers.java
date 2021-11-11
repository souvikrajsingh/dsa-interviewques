package com.souvik.Day40;

//https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/

public class GFG_sumofnNumbers {

    public static void main(String[] args) {

        System.out.println(sumofnum(10));

    }
    public static int sumofnum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return n + sumofnum(n -1);

    }
}
