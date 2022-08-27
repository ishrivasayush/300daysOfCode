package BasicJava;

import java.util.Scanner;

public class BillMachine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Price Of Your First Item: ");
        float pencil= scanner.nextFloat();
        System.out.println("Enter The Price Of Your Second Item: ");
        float pen= scanner.nextFloat();
        System.out.println("Enter The Price Of Your Third Item: ");
        float eraser= scanner.nextFloat();

        double total=pencil+pen+eraser;
        System.out.println("Items\tCost");
        System.out.println("***************************************");
        System.out.println("Pen:\t"+pen);
        System.out.println("Pencil:\t"+pencil);
        System.out.println("Eraser:\t"+eraser);
        System.out.println("***************************************");
        System.out.println("Total:\t"+total);
        System.out.println("GST:\t18%");
        double result=total+(0.18f*total);
        System.out.println("Result:\t"+result);
    }
}
