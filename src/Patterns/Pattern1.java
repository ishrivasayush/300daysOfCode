package Patterns;

import javax.security.sasl.SaslClientFactory;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        1->Number Of rows;
        2->Number of columns;
        3->What to print;
         */
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int j=1;
        while (j<=n) {
            int i=1;
            while (i <= n) {
                System.out.print("* ");
                i++;
            }
            j++;
            System.out.println();

        }
    }
}
