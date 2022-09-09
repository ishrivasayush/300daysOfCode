package CodeForMNC;

import java.util.Arrays;

/*
Min Of Array
 */
public class Day4 {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,2,3,0};
        int arr2[]={10,20,90,430,23};
        System.out.println("The Minimum of element of an array is:"+ minElement(arr1));
        System.out.println("The Minimum of element of an array is:"+ minElement2(arr2));
    }
    //Approach 1 O(nLogn)
    static int minElement(int arr[])
    {
        Arrays.sort(arr);
        return arr[0];
    }
    //Approach 2 O(n)
    static int minElement2(int arr[])
    {
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}
