package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=(n-i))
            {
                System.out.print(" ");
                j++;

            }
            int k=1;
            while (k<=(2*i-1)) //For odd Things We Are Just Taking the (2n-1).
            {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
