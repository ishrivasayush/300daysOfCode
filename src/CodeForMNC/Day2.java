package CodeForMNC;

import java.util.Scanner;

/*

*/
public class Day2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int sum=0;
        char ch[]=s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]>=49 && ch[i]<=57){
                sum+=(ch[i]-48);
            }
            else {
                sum+=maxOfDigits((int)ch[i]);
            }
        }
        System.out.println(sum);
    }
    public static int maxOfDigits(int n)
    {
        int max=0;
        while (n!=0) {
            int rem = n % 10;
            if (rem > max) {
                max = rem;
            }
            n=n/10;
        }

        return max;
    }
}
