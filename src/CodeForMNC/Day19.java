package CodeForMNC;

import java.util.Scanner;
/*
What are Armstrong Numbers?

Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.


 */
public class Day19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(13));
        System.out.println(isArmstrong(1));
    }
    static boolean isArmstrong(int n)
    {
        int originNo=n;
        int count=0;
        int temp=n;
        int sumOfPower=0;
        while (temp!=0)
        {
            temp=temp/10;
            count++;
        }
        while (n!=0)
        {
            int digit=n%10;
            sumOfPower+=Math.pow(digit,count);
            n=n/10;
        }
        return (sumOfPower==originNo);
    }
}
