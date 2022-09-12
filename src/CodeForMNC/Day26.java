package CodeForMNC;

import java.util.Scanner;
/*
Greatest of three numbers
Problem Statement: Given three numbers. Find the greatest of three numbers.
 */
public class Day26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        greatestAmongThree(n1,n2,n3);
    }
    //Approach 1
    static void greatestAmongThree(int n1,int n2,int n3)
    {
        int res=Math.max(n1,n2);
        int res2=Math.max(res,n3);
        System.out.println(res2);
    }
    //Approach 2
    static void max(int n,int n2,int n3)
    {
        if (n>n2 && n>n3)
        {
            System.out.println(n);
        }
        else if(n2>n3)
        {
            System.out.println(n2);
        }
        else {
            System.out.println(n3);
        }
    }
}
