package CodeForMNC;

import java.util.Scanner;

public class Day27 {
    /*
    Sum of first N Natural Numbers
Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sumOfN(n));
        System.out.println(sumOfN2(n));
    }
    //Approach 1 O(n)
    static int sumOfN(int n)
    {
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum=sum+i;
        }
        return sum;
    }

    //Approach 2 O(1)
    static int sumOfN2(int n)
    {
        int sum=0;
        sum=n*(n+1)/2;
        return sum;
    }

}
