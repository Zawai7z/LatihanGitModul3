package Mainan;

public class Bentuk {
    private String NamaBentuk;
    private int jumlahSisi;

    public Bentuk(String NamaBentuk, int jumlahSisi){
        this.NamaBentuk = NamaBentuk;
        this.jumlahSisi = jumlahSisi;
    }

    public String getNamaBentuk() {
        return NamaBentuk;
    }

    public int getJumlahSisi() {
        return jumlahSisi;
    }

    @Override
    public String toString() {
        return "Bentuk: " + NamaBentuk + " (" + jumlahSisi + " sisi)";
    }
}
