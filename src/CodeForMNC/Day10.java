package CodeForMNC;

import java.util.Scanner;
/*
Prime Numbers in given range,
Two nested loops are used here so the time complexity is N2
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=scanner.nextInt();
        int min=scanner.nextInt();
        for (int i = max; i <=min ; i++) {
            if (isPrime(i))
            {
                System.out.println(i+" is Prime Number");
            }
            else {
                System.out.println(i+" is not a prime Number");
            }
        }
    }
    static boolean isPrime(int n)
    {
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n==1)
            {
                return false;
            }
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
