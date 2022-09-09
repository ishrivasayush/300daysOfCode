package CodeForMNC;

import java.util.Scanner;

/*
Number is Palindrome Or not
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int dummy=x;
        int y=reverse(x);
        if (dummy==y)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
    static int reverse(int n)
    {
        int rev=0;
        while (n!=0) {
            int digit = n % 10;
            rev = 10 * rev + digit;
            n = n / 10;
        }
        return rev;
    }
}
