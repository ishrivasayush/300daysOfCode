package PatternPrinting;

import java.util.Scanner;

public class patternNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=1;
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
                System.out.print(count);
                k++;
                count++;
            }
            System.out.println();
            i++;
        }
    }
}
