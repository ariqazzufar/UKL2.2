public class Soal2_2{

    // Konstanta untuk nilai Pi
    private static final double PI = Math.PI;

    /**
     * Fungsi (method) untuk menghitung volume tabung.
     * * @param jariJari Jari-jari alas tabung (r).
     * @param tinggi Tinggi tabung (t).
     * @return Volume tabung (V = π * r^2 * t).
     */
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        // Rumus: V = π * r^2 * t
        double volume = PI * (jariJari * jariJari) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        // --- Inisialisasi Nilai Parameter ---
        double r = 5.0;  // Jari-jari tabung (misal: cm)
        double t = 12.0; // Tinggi tabung (misal: cm)

        // 1. Memanggil fungsi dengan parameter yang telah ditentukan
        double hasilVolume = hitungVolumeTabung(r, t);

        // 2. Menampilkan hasil
        System.out.println("=== Kalkulator Volume Tabung ===");
        System.out.println("Jari-jari (r)    : " + r);
        System.out.println("Tinggi (t)       : " + t);
        System.out.printf("Volume Tabung (V): %.2f (satuan kubik)\n", hasilVolume);
        System.out.println("================================");
    }
}