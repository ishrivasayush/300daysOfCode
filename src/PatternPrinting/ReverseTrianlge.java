package PatternPrinting;

import java.util.Scanner;

public class ReverseTrianlge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=i;
            while (j<=n)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
