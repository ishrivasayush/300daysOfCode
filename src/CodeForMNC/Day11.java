package CodeForMNC;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max= scanner.nextInt();
        int min= scanner.nextInt();
        for (int i = max; i <min ; i++) {
            if (isPalindrome(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isPalindrome(int n)
    {
        int reverse=0;
        int temp=n;
        while (temp!=0)
        {
            int digit=temp%10;
            reverse=10*reverse+digit;
            temp=temp/10;
        }
        if (n==reverse)
        {
            return true;
        }
        return false;
    }
}
