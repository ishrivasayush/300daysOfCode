package CodeForMNC;

import java.util.HashMap;

public class Day23 {
    public static void main(String[] args) {
        int arr[]={10,20,30,4,5,4,10,5};
        int n= arr.length;
        frequencyOfArrayElements(arr,n);
        Frequency(arr,n);
    }
    //Approach 1 O(n2)
    static void frequencyOfArrayElements(int arr[],int n)
    {
        boolean visited[]=new boolean[n];
        for (int i = 0; i <n ; i++) {
            if (visited[i]==true)
            {
                continue;
            }
            int count=1;
            for (int j = i+1; j <n ; j++) {
                if (arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
    //Approach 2 O(n)
    static void Frequency(int arr[],int n)
    {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if (hp.containsKey(arr[i]))
            {

                hp.put(arr[i],hp.get(arr[i])+1);
            }
            else
            {
                hp.put(arr[i],1);
            }
            System.out.println(hp);
        }

    }
}
