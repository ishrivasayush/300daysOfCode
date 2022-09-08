package PatternPrinting;

import java.util.Scanner;

public class NumberReactangle4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int z=n*n;
        int i=1;
        int k=z;
        while (i<=n)
        {
            int j=1;
            while (j<=n)
            {
                System.out.print(k);
                j++;
                k--;
            }
             i++;
            System.out.println();
        }
    }
}
