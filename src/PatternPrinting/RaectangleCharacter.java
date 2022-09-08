package PatternPrinting;


import java.util.Scanner;

public class RaectangleCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;

             n = scanner.nextInt();
        int i=65;
        while (i<=n)
        {
            int j=65;
            while (j<=n)
            {
                System.out.print((char)i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
