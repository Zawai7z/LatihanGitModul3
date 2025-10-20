package Mainan;

public class MainApp {
    public static void main(String[] args){
        Bentuk bentuk1 = new Bentuk("Lingkaran", 0);
        Merek merek1 = new Merek("Tamiya", "Jepang");
        Warna warna1 = new Warna("Merah");

        Mainan mobilbalap = new Mainan("Mobil Balap",bentuk1, merek1, warna1);

        mobilbalap.tampilkanInfo();
    }
}
