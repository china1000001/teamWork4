import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        meth("USA",1);
        meth("RUB",1);
        meth("UZB",1);
    }

    public static void meth(String valuta, int summa) {
        double a = 0.91;
        double b = 0.0073;
        double c = 88.39;
        switch (valuta) {
            case "USA":
                System.out.println(summa * c);
                break;
            case "RUB":
                System.out.println(summa * b);
                break;
            case "UZB":
                System.out.println(summa * a);
                break;
        }
    }
}