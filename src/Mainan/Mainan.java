package Mainan;

public class Mainan {
        private String NamaMainan;
        private Bentuk bentuk;
        private Merek merek;
        private Warna warna;

        public Mainan(String NamaMainan, Bentuk bentuk, Merek merek, Warna warna){
            this.NamaMainan = NamaMainan;
            this.bentuk = bentuk;
            this.merek = merek;
            this.warna = warna;
        }

        public void tampilkanInfo(){
            System.out.println("===== Informasi Mainan =====");
            System.out.println("Nama Mainan : " + NamaMainan);
            System.out.println(bentuk);
            System.out.println(merek);
            System.out.println(warna);
            System.out.println("============================");
        }
}
