package com.souvik.Day37;

public class Revision_Recursion {

    public static void main(String[] args) {

        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n) {
        if (n<2)
        {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1) ;

//        the recursive tree first finishes the right tree and then the left.


    }
}
