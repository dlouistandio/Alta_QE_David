public class MenghitungSegitiga {
    int alas;
    int tinggi;

    public MenghitungSegitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungLuas(){
        return this.alas * this.tinggi / 2;
    }

    public int hitungKeliling(){
        double a = Math.pow(this.alas,2);
        double b = Math.pow(this.tinggi,2);
        double sisi = Math.sqrt(a + b);
        return (int) (this.alas + this.tinggi + sisi);
    }
}
