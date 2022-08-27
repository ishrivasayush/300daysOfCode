package BasicJava;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The Area Of Square:");
        int side= scanner.nextInt();
        int area=side*side;
        System.out.println("The Area Of Square is: "+ area);
    }
}
