package com.souvik.Day40;

//https://bit.ly/3EcIujJ

import java.util.Scanner;

public class GFG_geekonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(helper(N));

    }

    public static int helper( int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 2;
        }
        return helper(n - 1) + helper(n - 2) + helper(n - 3);
    }
}
