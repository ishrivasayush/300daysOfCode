package PatternPrinting;

import java.util.Scanner;

public class StartTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=i)
            {
                System.out.print(" ");
                j++;
            }
            int k=i;
            while (k<=n)
            {
                System.out.print("*");
                k++;
            }

            i++;
            System.out.println();
        }
    }
}
