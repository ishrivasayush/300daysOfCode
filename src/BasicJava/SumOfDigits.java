package BasicJava;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        int rem;
        while (num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
