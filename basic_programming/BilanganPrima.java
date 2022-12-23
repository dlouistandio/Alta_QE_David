import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));

    }

    private static boolean primeNumber(int angka) {
        int faktor = 0;

        for (int i = 1; i < angka; i++) {
            if (angka % i == 0) {
                faktor = faktor + 1;
            }
            if (faktor >= 2) {
                return false;
            }
        }
        return true;
    }
}