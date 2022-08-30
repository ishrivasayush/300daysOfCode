package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int j=1;
        int count=1;
        while (j<=n) {
            int i=1;
            while (i <= n) {
                System.out.print(count+" ");
                i++;
                count++;
            }
            j++;
            System.out.println();

        }
    }
}
