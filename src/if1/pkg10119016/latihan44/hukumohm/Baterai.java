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
public class Baterai {
 private float kuatArus, hambatan;

    public Baterai(){
        
    }

    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}
