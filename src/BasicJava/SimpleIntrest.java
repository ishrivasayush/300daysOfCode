package BasicJava;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        /*
        double=double+/double;
        double=double+/int;
        double=int+/double;
        int=int+/int;

         */

        Scanner scanner=new Scanner(System.in);
        int p=scanner.nextInt();
        float r=scanner.nextFloat();
        int t=scanner.nextInt();
        Double sI=(double)(p*r*t)/100;
        System.out.println(sI);
    }
}
