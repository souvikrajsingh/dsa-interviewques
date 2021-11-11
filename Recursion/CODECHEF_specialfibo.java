package com.souvik.Day40;

//https://www.codechef.com/problems/FIBXOR01/

public class CODECHEF_specialfibo {
    public static void main(String[] args) {
        System.out.println(fibo(86,77,15));
    }
    public static int fibo(int a, int b, int n)
    {
        if( n == 0)
        {
            return a;
        }
        if( n == 1)
        {
            return b;
        }
        return fibo(a,b,n-1)^fibo(a,b,n-2);
    }
}
