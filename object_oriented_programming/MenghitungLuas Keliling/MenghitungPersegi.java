public class MenghitungPersegi {

    int sisi;

    public MenghitungPersegi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuas(){
      return this.sisi * 2;
    }

    public int hitungKeliling(){
        return this.sisi * 4;
    }
}
