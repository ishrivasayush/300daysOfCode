package CodeForMNC;

import java.util.stream.IntStream;

public class Day6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The sum of array Elements:"+sumOfArrayElements(arr));
        System.out.println("The sum of array Elements:"+sumOfArrayElements2(arr));
    }
    //Approach 1 O(n)
    static int sumOfArrayElements(int arr[])
    {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //Approach 2 O(n)
    static int sumOfArrayElements2(int arr[])
    {
        int sum= IntStream.of(arr).sum();
        return sum;
    }

}
