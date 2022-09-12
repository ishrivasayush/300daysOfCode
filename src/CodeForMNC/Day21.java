package CodeForMNC;

import java.util.Arrays;
/*
Rearrange array in increasing-decreasing order
Problem Statement: Rearrange the array such that the first half is arranged in increas
ing order, and the second half is arranged in decreasing order
O(nlogn)+n
so O(nlogn)
 */
public class Day21 {
    public static void main(String[] args) {
        int arr[]={4 ,2 ,8, 6 ,15 ,5 ,9 ,20};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length/2 ; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = arr.length-1;i >= arr.length/2 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }

}
