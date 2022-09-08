package PatternPrinting;

import java.util.Scanner;

public class Triangle5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=1;
            int value=i;
            while (j<=i)
            {
                System.out.print(value);
                j++;
                value++;
            }
            i++;
            System.out.println();
        }
    }
}
