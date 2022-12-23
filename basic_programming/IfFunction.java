import java.util.Scanner;

public class IfFunction {
    public static void main(String[] args) {
        int nilai;
        String nilaiMurid = "";

        Scanner nilaiTest = new Scanner(System.in);
        System.out.println("Masukan Nilai: ");
        nilai = nilaiTest.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            nilaiMurid = "A+";
        } else if(nilai >= 65 && nilai <= 79) {
            nilaiMurid = "B+";
        } else if(nilai >= 50 && nilai <= 64){
            nilaiMurid = "B";
        } else if(nilai >= 35 && nilai <= 49){
            nilaiMurid = "C";
        } else if(nilai >= 0 && nilai <= 34){
            nilaiMurid = "D";
        } else{
            nilaiMurid = "Invalid";
        }
        System.out.println("Ini Nilai kamu: " + nilaiMurid);
    }
}
