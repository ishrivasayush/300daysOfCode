package BasicJava;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int i=2;
        while (i<num)
        {
            if (num%i==0)
            {
                System.out.println("Not a Prime Number");
                return;
            }
            i++;
        }
        System.out.println("Prime Number");
    }
}
