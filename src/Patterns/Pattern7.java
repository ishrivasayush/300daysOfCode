package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int j=1;
        while (j<=n) {
            int i=1;
            while (i <= j) {
                System.out.print(i+" ");
                i++;
            }
            j++;
            System.out.println();

        }
    }
}
