class Mobil{
    String merk;
    String warna;
    int tahun;

    void infoMobil(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

}
public class main{
    public static void main(String[] args){
        Mobil mobil1 =new Mobil();

        mobil1.merk = "Honda";
        mobil1.warna = "Hideng";
        mobil1.tahun = 2024;

        mobil1.infoMobil();

        System.out.println();

        Mobil mobil2 = new Mobil();

        mobil2.merk = "Esemka";
        mobil2.warna = "Ijo";
        mobil2.tahun = 2014;
        mobil2.infoMobil();
    }
}