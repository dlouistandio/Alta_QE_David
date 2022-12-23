public class VolumeBalok {
    int panjang,lebar,luas;

    public VolumeBalok(int panjang, int lebar, int luas) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = luas;
    }

    public int menghitungVolume(){
        return this.panjang * this.lebar * this.luas;
    }
}
