package PatternPrinting;

import java.util.Scanner;

public class Triangle3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        int k=1;
        while (i<=n)
        {
            int j=1;

            while (j<=i)
            {
                System.out.print(k);
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
