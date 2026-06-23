package bagian2.bacatulis;
import java.io.*;

public class LatihanMandiri2 {

    public static void main(String[] args) {

        try {
            // 1. Menulis 5 nama hari ke file hari.txt
            FileWriter fw = new FileWriter("hari.txt");
            fw.write("Senin\n");
            fw.write("Selasa\n");
            fw.write("Rabu\n");
            fw.write("Kamis\n");
            fw.write("Jumat\n");
            fw.close();

            System.out.println("Isi awal file:");
            tampilkanIsiFile();

            // 2. Menambahkan 2 nama hari lagi (append)
            FileWriter appendFile = new FileWriter("hari.txt", true);
            appendFile.write("Sabtu\n");
            appendFile.write("Minggu\n");
            appendFile.close();

            System.out.println("\nSetelah ditambahkan:");
            tampilkanIsiFile();

            // 3. Menghitung jumlah baris
            BufferedReader br = new BufferedReader(new FileReader("hari.txt"));
            int jumlahBaris = 0;

            while (br.readLine() != null) {
                jumlahBaris++;
            }

            br.close();

            System.out.println("\nJumlah baris dalam file: " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Method untuk menampilkan isi file
    public static void tampilkanIsiFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("hari.txt"));
        String baris;

        while ((baris = br.readLine()) != null) {
            System.out.println(baris);
        }

        br.close();
    }
}