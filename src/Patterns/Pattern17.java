package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=i;
            while (j<=n-1)
            {
                System.out.print(" ");
                j++;
            }
            int k=i;
            while (k<=n)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}

