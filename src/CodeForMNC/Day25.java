package CodeForMNC;

import java.util.Scanner;

/*
O(logn)
Reverse digits of a number
Problem Statement: Given an integer. Write a program to reverse digits of a number.
 */
public class Day25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int res=reverse(n);
        System.out.println(res);
    }
    static int reverse(int n)
    {
        int rev=0;
        while (n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
}
