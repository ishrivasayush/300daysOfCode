package CodeForMNC;

import java.util.Scanner;

/*
O(logn)
Maximum and Minimum Digit in a Number
 */
public class Day24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        minMaxDigits(n);
    }
    static void minMaxDigits(int n)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while (n!=0)
        {
            int digit=n%10;
            if (digit<min)
            {
                min=digit;
            }
            if (digit>max)
            {
                max=digit;
            }
            n=n/10;

        }
        System.out.println(max+" "+min);
    }
}
