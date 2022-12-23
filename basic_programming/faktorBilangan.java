import java.util.Scanner;

public class faktorBilangan {
    public static void main(String[] args) {
        int bilangan;

        Scanner angka = new Scanner(System.in);
        System.out.println("Masukan Angka disini: ");
        bilangan = angka.nextInt();

        for(int i = 1; i <= bilangan; i++){
            if (bilangan % i == 0){
                System.out.println("Faktor " + i);
            }
        }
    }
}
