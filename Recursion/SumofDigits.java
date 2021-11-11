package com.souvik.Day37;

public class SumofDigits {

    public static void main(String[] args) {

        System.out.println(sum_digit(12345));
    }

    public static int sum_digit(int n) {

            if (n == 0) {
                return 0;
            }
            return (n % 10) + sum_digit(n / 10);
        }
    }

