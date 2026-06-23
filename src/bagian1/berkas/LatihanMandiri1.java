
package bagian1.berkas;
import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // =========================
        // SOAL 1
        // =========================
        File laporan = new File("laporan.txt");

        System.out.println("=== Soal 1 ===");
        if (laporan.exists()) {
            System.out.println("Berkas laporan.txt ada.");
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ada.");
        }

        // =========================
        // SOAL 2
        // =========================
        System.out.println("\n=== Soal 2 ===");
        File arsip = new File("arsip");

        boolean hasilMkdir = arsip.mkdir();

        if (hasilMkdir) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        System.out.println("Nilai yang dikembalikan method mkdir(): " + hasilMkdir);

        // =========================
        // SOAL 3
        // =========================
        System.out.println("\n=== Soal 3 ===");
        File sementara = new File("sementara.txt");

        try {
            // Membuat file sementara.txt
            sementara.createNewFile();

            System.out.println("Sebelum dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

            // Menghapus file
            sementara.delete();

            System.out.println("Sesudah dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
