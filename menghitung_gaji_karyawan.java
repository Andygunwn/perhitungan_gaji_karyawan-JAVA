// Tugas 2 Tuton 
// Universitas Terbuka

// Nama : Andi Gunawan
// NIM  : 058848372
// Program Studi : Sistem Informasi
// UPBJJ UT : Jember
// Mata Kuliah : Algoritma dan Pemrograman

// import library Scanner untuk membaca input dari pengguna
import java.util.Scanner;

public class menghitung_gaji_karyawan {
    public static void main(String[] args) {

        // Deklarasi variabel
        String golongan;
        int jamLembur;
        int gajiPokok = 0;
        int gajiLembur = 0;
        int totalPenghasilan = 0;

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner inputUser = new Scanner(System.in);

        // Meminta input golongan karyawan dari pengguna
        System.out.print("Masukkan golongan karyawan: ");
        golongan = inputUser.nextLine();

        // Meminta input jumlah jam lembur dari pengguna
        System.out.print("Masukkan jumlah jam lembur: ");
        jamLembur = inputUser.nextInt();

        // Memberikan gaji pokok berdasarkan golongan karyawan
        // equalsIgnoreCase digunakan untuk membandingkan string tanpa memperhatikan
        // huruf besar/kecil
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid, mohon periksa kembali golongan.");
            inputUser.close();
            return; // Keluar dari program jika golongan tidak valid
        }

        // Menghitung gaji lembur berdasarkan jumlah jam lembur
        if (jamLembur == 1) {
            gajiLembur = gajiPokok * 30 / 100; // 30% dari gaji pokok
        } else if (jamLembur == 2) {
            gajiLembur = gajiPokok * 32 / 100; // 32% dari gaji pokok
        } else if (jamLembur == 3) {
            gajiLembur = gajiPokok * 34 / 100; // 34% dari gaji pokok
        } else if (jamLembur == 4) {
            gajiLembur = gajiPokok * 36 / 100; // 36% dari gaji pokok
        } else if (jamLembur >= 5) {
            gajiLembur = gajiPokok * 38 / 100; // 38% dari gaji pokok
        } else {
            System.out.println("Karyawan tidak lembur.");
        }

        // Menutup objek Scanner setelah selesai digunakan
        inputUser.close();

        // Menghitung total penghasilan karyawan
        totalPenghasilan = gajiPokok + gajiLembur;

        // Menampilkan hasil perhitungan gaji karyawan
        System.out.println("\n\n--- Rincian Gaji Karyawan ---");
        System.out.println("Golongan Karyawan: " + golongan);
        System.out.println("Gaji pokok karyawan: Rp." + gajiPokok);
        System.out.println("Jumlah jam lembur: " + jamLembur + " Jam");
        System.out.println("Gaji lembur karyawan: Rp." + gajiLembur);
        System.out.println("Total penghasilan karyawan: Rp." + totalPenghasilan);

        // Selesai
    }
}