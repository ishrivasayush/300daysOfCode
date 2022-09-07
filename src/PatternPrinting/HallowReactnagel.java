package PatternPrinting;

import java.util.Scanner;

public class HallowReactnagel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=n)
            {
                if(i==1 || i==n ||j==1 || j==n)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
