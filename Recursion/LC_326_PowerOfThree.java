package com.souvik.Day40;

//https://leetcode.com/problems/power-of-three/

public class LC_326_PowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n) {

         /*Runtime: 18 ms, faster than 48.20% of Java online submissions for Power of Three.
    Memory Usage: 44 MB, less than 18.78% of Java online submissions for Power of Three.*/

        /*if(n == 0)
            return false;
        if(n==1)
            return true;
        if(n%3 >= 1)
            return false;
        return isPowerOfThree(n/3);*/



        /*Runtime: 10 ms, faster than 100.00% of Java online submissions for Power of Three.
                Memory Usage: 38.5 MB, less than 88.12% of Java online submissions for Power of Three.*/

            while(n>=3){
                if(n%3!=0) return false;
                n/=3;
            }
            return n==1;
    }

}
