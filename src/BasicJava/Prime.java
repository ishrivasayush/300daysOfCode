package BasicJava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (isPrime(num))
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a prime Number");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i*i <n ; i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
