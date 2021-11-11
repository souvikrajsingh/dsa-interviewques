package com.souvik.Day37;

public class LC_509_Fibonacci {

    public static void main(String[] args) {

        System.out.println(fib(1));

    }
    public static int fib(int n) {


        /*Runtime: 14 ms, faster than 8.39% of Java online submissions for Fibonacci Number.
    Memory Usage: 37.8 MB, less than 18.80% of Java online submissions for Fibonacci Number.

    using recursion*/

        if (n<2)
        {
            return n;
        }
        return fib(n - 2) + fib(n - 1) ;

        /* Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
        Memory Usage: 35.8 MB, less than 66.69% of Java online submissions for Fibonacci Number.*/

        /*if(n==0)
            return 0;

        int dp[]=new int[n+1];

        dp[0]=0;dp[1]=1;

        for(int i=2;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];

        return dp[n];*/
    }
}

