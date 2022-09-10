package CodeForMNC;

import java.util.Scanner;

/*
Prime Or Not
-A number Which is divisible by itself and 1 is called the prime Number.
O(root n)
 */
public class Day9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n)
    {
        if (n==1)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
