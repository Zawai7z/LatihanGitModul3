package Mainan;

public class Warna {
    private String WarnaUtama;

    public Warna(String WarnaUtama){
        this.WarnaUtama = WarnaUtama;
    }

    public String getWarnaUtama() {
        return WarnaUtama;
    }

    @Override
    public String toString(){
        return "Warna: " + WarnaUtama;
    }
}
