package CodeForMNC;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int max=0;
        while (n!=0)
        {
            int rem=n%10;
            if (rem>max)
            {
                max=rem;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}
