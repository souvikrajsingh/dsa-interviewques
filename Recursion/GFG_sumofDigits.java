package com.souvik.Day40;

//https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

public class GFG_sumofDigits {

    public static void main(String[] args) {

        System.out.println(sumofdigits(1234));
    }

    public static int sumofdigits(int n)
    {
        if( n == 0)
        {
            return  0;
        }
        if( n == 1)
        {
            return 1;
        }
        return (n%10) + sumofdigits(n/10);
    }
}
