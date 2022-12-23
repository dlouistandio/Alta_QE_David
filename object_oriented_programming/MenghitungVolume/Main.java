public class Main {
    public static void main(String[] args) {
        VolumeKubus kubus = new VolumeKubus(10);
        System.out.println("Volume Kubus: " + kubus.menghitungVolume());

        VolumeBalok balok = new VolumeBalok(3,6,10);
        System.out.println("Volume Balok: " + balok.menghitungVolume());

        VolumeTabung tabung = new VolumeTabung(7,10);
        System.out.println("Volume Tabung: " + tabung.menghitungVolume());
    }
}