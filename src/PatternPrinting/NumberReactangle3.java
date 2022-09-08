package PatternPrinting;

import java.util.Scanner;

public class NumberReactangle3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        int k=1;
        while (i<=n)
        {
            int j=1;

            while (j<=n)
            {
                System.out.print(k);
                j++;
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
