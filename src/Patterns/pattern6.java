package Patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int j=1;
        int k=1;
        while (j<=n) {
            int i=1;
            while (i <= j) {
                System.out.print(k+" ");
                i++;
                k++;
            }
            j++;
            System.out.println();

        }
    }
}
