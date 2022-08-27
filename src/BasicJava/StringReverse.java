package BasicJava;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Name=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(Name);
        stringBuilder.reverse().toString();
        System.out.println(stringBuilder);
    }
}
