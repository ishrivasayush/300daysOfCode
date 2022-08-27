package BasicJava;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int evenSum=0;
        int oddSum=0;
        int arr[]=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]%2==0)
            {
                evenSum=evenSum+arr[i];
            }
            else {
                oddSum=oddSum+arr[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
