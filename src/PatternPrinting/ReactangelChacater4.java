package PatternPrinting;

import java.util.Scanner;

public class ReactangelChacater4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=65;
        while (i<=n)
        {
            int j=65;
            while (j<=i)
            {
                System.out.print((char) i);
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
