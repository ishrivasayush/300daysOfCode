package PatternPrinting;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=i)
            {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
