package BasicJava;

import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int power=scanner.nextInt();
        int ans=1;
        int i=1;
        while (i<=power)
        {
            ans=ans*n;
            i=i+1;
        }
        System.out.println(ans);
    }
}
