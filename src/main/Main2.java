package main;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String x=s.nextLine();

        System.out.println(x);
        if(x.length()%2==0)
            System.out.println("Par");
        else
            System.out.println("Impar");

        Scanner y=new Scanner(System.in);
        int p=y.nextInt();
        int i=1;
        int nr=1;
        while(i<=p)
        {
            nr=nr*i;
            i++;
        }
        System.out.println(nr);

        Scanner b=new Scanner(System.in);
        int r=b.nextInt();
        int ok=0;
        for(int j=2;j<r;j++)
        {
            if(r%j==0)
            {
                System.out.println("Nu e prim");
                ok=1;
                break;
            }

        }
        if(ok==0)
            System.out.println("E prim");
    }
}
