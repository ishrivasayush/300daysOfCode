package CodeForMNC;

import java.util.Arrays;
/*
Max of an Array
 */
public class Day5 {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,2,3,0};
        int arr2[]={10,20,90,430,23};
        System.out.println("The Maximum of element of an array is:"+ maxElement(arr1));
        System.out.println("The Maximum of element of an array is:"+ maxElement2(arr2));
    }
    static int maxElement(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int maxElement2(int arr[])
    {
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}
