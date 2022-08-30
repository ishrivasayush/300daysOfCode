package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int j=1;
        while (j<=n) {
            int i=1;
            while (i <= n) {
                System.out.print(j+" ");
                i++;
            }
            j++;
            System.out.println();

        }
    }
}
