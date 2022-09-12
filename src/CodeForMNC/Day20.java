package CodeForMNC;
/*
Avg of array elements O(n)
 */
public class Day20 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The Average of the Number is: "+ avgOfArrayElements(arr));
     }
    static int avgOfArrayElements(int arr[])
    {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        int avg=sum/arr.length;
        return avg;
    }
}
