package com.souvik.Day37;

//program to count the number of zeros

public class Zeros {
    public static void main(String[] args) {
        System.out.println(numberofzeros(30204));

    }
    public static int numberofzeros(int n)
    {
        return helper(n, 0 );
    }
    public static int helper(int n, int zeroes)
    {
        if(n == 0)
        {
            return zeroes;
        }
        if(n%10 == 0) {
            return helper(n / 10, zeroes + 1);
        }
        return helper( n/10 , zeroes);
    }
}
