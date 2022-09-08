package PatternPrinting;

import java.util.Scanner;

public class ReactangleChacter3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 65;
        int value=65;
        while (i <= n) {
            int j = 65;
            while (j <= n) {
                System.out.print((char)value+" ");
                j++;
                value++;
            }
            System.out.println();
            i++;
        }
    }
}
