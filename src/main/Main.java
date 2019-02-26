package main;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("ceva");

        char c = 'a';
       // c = (char)((int)c + 1);
        c += 1;
        System.out.println(c);

        int x=0546; //baza 8
        System.out.println(x);

        int y=0xff; //2 la 8
        System.out.println(y);

        int z=0b110110; //binar
        System.out.println(z);

        float f=10.5f;
        System.out.println(f);

        int q=6<4 ? 10 : 7;
        System.out.println(q);
    }

}
