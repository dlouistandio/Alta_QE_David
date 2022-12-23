public class MenghitungPersegiPanjang {
    int panjang;
    int lebar;

    public MenghitungPersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int menghitungLuas(){
        return this.panjang * this.lebar;
    }

    public int menghitungKeliling(){
        return (this.panjang + this.lebar) * 2;
    }
}
