package BasicJava;

public class Abc {
   int a;
   int b;
   Abc()
   {
       a=10;
       b=20;
   }
}
class Abv extends Abc{
    Abv()
    {
        super();
    }
}
class D{
    public static void main(String args[]) {
        Abv v=new Abv();
        System.out.println(v.a+" "+v.b);
    }
}

