package if1.pkg10119016.latihan44.hukumohm;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * menghitung arus listrik menggunakan getter setter
 */
public class IF110119016Latihan44HukumOhm {

    
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3f, 12f);
        System.out.println("===================Hukum Ohm=======================");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n" +
                           "akan berbanding lurus dengan beda potensial\n" +
                           "pada ujung-ujung kawat penghantar tersebut\n" +
                           "asalkan suhu kawat dijaga konstan.\n");
        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : "+ baterai1.hitungTegangan() + " volt");
    }
}