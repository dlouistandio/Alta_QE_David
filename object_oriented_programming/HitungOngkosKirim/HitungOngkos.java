public class HitungOngkos extends VolumeBarang {
    double hargaOngkos = 5000;

    public double ongkosKirim(){
        double volume = panjang * lebar * tinggi;
        double ongkosVolume = volume/50;
        double minBarang = Math.ceil(berat);

        if(ongkosVolume > 1 || berat > 1){
            hargaOngkos = (ongkosVolume + minBarang) * hargaOngkos;
        }
        return hargaOngkos;
    }

}
