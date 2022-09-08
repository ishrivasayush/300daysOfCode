package CodeForMNC;
import java.util.Scanner;
/*
input-Ayush
output-aYuSh
 */
public class Day1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char ch[]=s.toCharArray();
        for (int i = 0; i < ch.length ; i++) {
            if (i%2==0)
            {
                //CheckLowerOrNot
                if (!(ch[i]>='a'&& ch[i]<='z'))
                {
                    ch[i]+=32;
                }
            }
            else {
                //CheckUpperOrNot
                if (!(ch[i]>='A'&& ch[i]<='z'))
                {
                    ch[i]-=32;
                }
            }
        }
        for (int i = 0; i < ch.length ; i++) {
            System.out.print(ch[i]);
        }
    }
}
