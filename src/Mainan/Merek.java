package Mainan;

public class Merek {
    private String namaMerek;
    private String AsalNegara;

    public Merek(String namaMerek, String AsalNegara){
        this.namaMerek = namaMerek;
        this.AsalNegara = AsalNegara;
    }

    public String getAsalNegara() {
        return AsalNegara;
    }

    public String getNamaMerek() {
        return namaMerek;
    }

    @Override
    public String toString() {
        return "Merek: " + namaMerek + " (Asal: " + AsalNegara + ")";
    }
}
