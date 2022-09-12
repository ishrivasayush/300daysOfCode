package CodeForMNC;

import java.util.Scanner;
/*
Problem Statement: Perfect Number. Write a program to find whether a number is a perfect number or not.

A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself).

 */
public class Day18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        isPerfect(n);
    }
    static void isPerfect(int n)
    {
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0)
            {
                sum=sum+i;
            }
        }
        if (sum==n)
        {
            System.out.println("perfect");
        }
        else {
            System.out.println("Not");
        }
    }

}
