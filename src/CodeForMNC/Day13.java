package CodeForMNC;

import java.util.Arrays;

/*
Second Largest and smallest Element in array.
 */
public class Day13 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        smallestLargest(arr,6);
        System.out.println(smallest(arr,6));
        System.out.println(secondLargest(arr,6));

    }
    //Approach 1
    //(Brute Force) [this approach only works if there are no duplicates]

    static void smallestLargest(int arr[],int n)
    {
        if (n==0 || n==1)
        {
            System.out.print("-1");
            System.out.print(" ");
            System.out.print("-1");
            System.out.println();
        }
        Arrays.sort(arr);
        int secondSmallest=arr[1];
        int secondLargest=arr[n-2];
        System.out.println(secondSmallest);
        System.out.println(secondLargest);
    }
    //Approach 2
    static int smallest(int arr[],int n)
    {
        if(n<2)
        {
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<small)
            {
                secondSmall=small;
                small=arr[i];
            }
            else if(arr[i]!=small && arr[i]<secondSmall)
            {
                secondSmall=arr[i];
            }
        }
        return secondSmall;
    }
    static int secondLargest(int arr[],int n)
    {
        if(n<2)
        {
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else if (arr[i]!=largest && arr[i]>secondlargest)
            {
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}
