package PatternPrinting;

import java.awt.*;
import java.util.Scanner;

public class patternPrintingNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=i;
            while (j<=n)
            {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while (k<=i)
            {
                System.out.print(i);
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
