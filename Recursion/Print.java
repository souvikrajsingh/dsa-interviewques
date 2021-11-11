package com.souvik.Day37;

public class Print {

    public static void main(String[] args) {

        printnumsBoth(5);

    }

    static void printnums( int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnums(n-1);
    }

    static void printnumsRev( int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }

        printnumsRev(n-1);
        System.out.println(n);
    }
    static void printnumsBoth( int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnumsBoth(n-1);
        System.out.println(n);
    }
}
