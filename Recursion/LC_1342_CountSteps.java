package com.souvik.Day37;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class LC_1342_CountSteps {

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {

        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
        Memory Usage: 38 MB, less than 11.94% of Java online submissions for Number of Steps to Reduce a Number to Zero.*/

        return helper(num , 0);

    }

    static int helper(int num, int steps) {

        if(num == 0)
        {
            return steps;
        }
        if(num % 2 == 0)
        {
            return helper(num / 2 , steps+ 1);
        }
        return helper((num - 1) , steps + 1);

    }
}
