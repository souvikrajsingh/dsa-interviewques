package com.souvik.Day37;

public class Reverse {
    static int method2(int n)
    {
        int digit = (int) Math.log10(n) + 1; // finding the number of digits
        return helper(n,digit);
    }

    static int helper(int n, int digit) {

        if(n%10 == n)
        {
            return n;
        }
        int rem = (n%10);
        return rem *(int)Math.pow(10,digit - 1) + helper(n/10,digit - 1);

        /*n = 1234
        *
        * 4* (10 ^ 3 ) + 123
        *                3 + (10 ^ 2) + 12
        *                               2 + ( 10 ^ 1 ) + 1
        *
        * */
    }
    public static void main(String[] args) {


        System.out.println(method2(123));

    }

//  method 1 to reverse a number

    /*static int sum = 0;
    static void reverseanumber(int n)
    {
        if(n == 0)
        {
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverseanumber(n/10);
    }*/

}
