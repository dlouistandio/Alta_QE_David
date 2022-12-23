public class VolumeKubus {
    double sisi;

    public VolumeKubus(double sisi) {
        this.sisi = sisi;
    }

    public int menghitungVolume(){
        sisi = Math.pow(sisi,3);
        return (int) this.sisi;
    }
}
