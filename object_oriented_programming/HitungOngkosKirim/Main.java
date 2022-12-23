public class Main {
    public static void main(String[] args) {
        HitungOngkos ongkos = new HitungOngkos();

        ongkos.VolumeBarang(5,2,4,1);
        System.out.println("Ongkos Kirim: " + ongkos.ongkosKirim());
    }
}