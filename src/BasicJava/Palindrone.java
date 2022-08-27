package BasicJava;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num=scanner.next();
        StringBuilder stringBuilder=new StringBuilder(num);
        String s=stringBuilder.reverse().toString();
        if (s.equals(num))
        {
            System.out.println("Done");
        }

    }
}
