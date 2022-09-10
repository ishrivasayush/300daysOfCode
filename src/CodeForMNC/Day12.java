package CodeForMNC;



public class Day12 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int n=arr.length;

        arrayReverse(arr,n);

    }
    static void arrayReverse(int arr[],int n)
    {
        int p1=0;
        int p2=n-1;
        while (p1<p2)
        {
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        printArray(arr,n);
    }
    //Approach 1 O(n)
    static void printArray(int arr[],int n)
    {
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //Approach 2
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
}
