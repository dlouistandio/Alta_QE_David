public class Main {
    public static void main(String[] args) {
        MenghitungPersegi persegi = new MenghitungPersegi(4);
        System.out.println("Keliling perrsegi: " + persegi.hitungKeliling());
        System.out.println("Luas perrsegi: " + persegi.hitungLuas());

        MenghitungSegitiga segitiga = new MenghitungSegitiga(3,4);
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());

        MenghitungPersegiPanjang persegipanjang = new MenghitungPersegiPanjang(7,8);
        System.out.println("Keliling Persegi Panjang: " + persegipanjang.menghitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegipanjang.menghitungLuas());
    }
}