package CodeForMNC;

import java.util.Scanner;
/*
if the last digit of the number is 0 than its a even
if the last digit of the number is 1 than its a odd
 */
public class day17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(oddEven(n)==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    static int oddEven(int n)
    {
        if ((n&1)==0)
        {
            return 0;
        }
        else {
            return 1;
        }
    }
}
