public class BasicsPattern {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while (i<=n)
        {
            int j=1;
            while (j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i=1;
        while (i<=n)
        {
            int j=i;
            while (j<=(n-1))
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
