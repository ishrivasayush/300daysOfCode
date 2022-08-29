package BasicJava;

import java.util.Scanner;

public class CharacterIdentification {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char ch=scanner.nextLine().charAt(0);
        int n=(int)ch;
        System.out.println(code(n));
    }
    public static int code(int n)
    {
        if (n>=97 && n<=122)
        {
            return 1;
        }
        else if (n>=65 && n<=90)
        {
            return 0;
        }
        else {
            return -1;
        }
    }
}
