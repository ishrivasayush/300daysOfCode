package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=(n-i+1))
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
