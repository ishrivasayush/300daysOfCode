package BasicJava;

import java.util.Scanner;

public class Ncr {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int r= scanner.nextInt();
        int factn=factorial(n);
        int factr=factorial(r);
        int factnr=factorial(n-r);
        int ncr=factn/(factnr*factr);
        System.out.println(ncr);
    }
    public static int factorial(int n)
    {
        int i=1;
        int fact=1;
        while (i<=n)
        {
            fact=fact*fact;
            i++;
        }
        return fact;
    }

}
