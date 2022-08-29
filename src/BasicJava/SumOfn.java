package BasicJava;

import java.util.Scanner;

public class SumOfn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        int i=1;
        while (i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
