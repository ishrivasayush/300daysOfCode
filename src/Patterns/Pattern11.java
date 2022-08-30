package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=n-1;
            while (j>=i)
            {
                System.out.print(" ");
                j--;
            }
            int k=1;
            while (k<=i)
            {
                System.out.print(i);
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
