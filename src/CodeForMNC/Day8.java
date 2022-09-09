package CodeForMNC;
/*
Moves all Zeros at the end
 */
public class Day8 {
    public static void main(String[] args) {
        int arr[]={0,10,0,20,30,0,50};
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while (arr.length>count)
        {
            arr[count]=0;
            count++;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
