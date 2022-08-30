package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=n;
            int k=1;
            while (j>=i)
            {
                System.out.print(k);
                j--;
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
