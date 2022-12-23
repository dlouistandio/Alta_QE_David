public class VolumeTabung {

    double diameter,tinggi;

    public VolumeTabung(double diameter, double tinggi) {
        this.diameter = diameter;
        this.tinggi = tinggi;
    }

    public double menghitungVolume(){
        double volume = Math.PI * Math.pow(diameter,2) * tinggi;
        return Math.ceil(volume);
    }
}
