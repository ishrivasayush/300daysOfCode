package BasicJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a=0;
        int c=0;
        int b=1;
        for (int i = 0; i <=n ; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
    }
}
