package Patterns;

import java.util.Scanner;

public class DaimondPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=i;
            while (j<=n-1)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            while (k<=(2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=i)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            while (k<=2*(n-i)-1)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
