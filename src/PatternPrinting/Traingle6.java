package PatternPrinting;

import java.util.Scanner;

public class Traingle6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int value=i;
            int j=1;
            while (j<=i)
            {
                System.out.print(value);
                j++;
                value--;
            }
            System.out.println();
            i++;
        }
    }
}
