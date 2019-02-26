package main;

public class Main1 {
    public static void main(String[] args) {

        char anotimp='a';

        switch(anotimp)
        {
            case 'v':

                System.out.println("E vara");
                break;


            case 'i':

                System.out.println("E iarna");
                break;

            case 'p': case't':

                System.out.println("Ploua");
                break;

            default:
                System.out.println("Error");
        }
    }
}
