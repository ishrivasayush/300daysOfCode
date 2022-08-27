package BasicJava;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int num;
        int res=0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter Your "+i+" Number :");
            num= scan.nextInt();
            sum=sum+num;
            res=sum/3;
        }
        System.out.println(res);
    }
}
