import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String formatData() {
        return "NAMA: " + nama + ", NIM: " + nim + ", JURUSAN: " + jurusan;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaUmmList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU MAHASISWA:");
            System.out.println("1. INPUT DATA MAHASISWA");
            System.out.println("2. TAMPILAN DATA MAHASISWA UMM");
            System.out.println("3. KELUAR");
            System.out.print("PILIHAN: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                inputDataMahasiswaUmm(mahasiswaUmmList);
            } else if (pilihan.equals("2")) {
                System.out.println("Universitas Muhammadiyah Malang");
                tampilDataMahasiswaUmm(mahasiswaUmmList);
            } else if (pilihan.equals("3")) {
                break;
            } else {
                System.out.println("MENU ANDA BELUM VALIDD!!!");
            }
        }
    }

    public static void inputDataMahasiswaUmm(List<Mahasiswa> mahasiswaUmmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("MASUKKAN NAMA MAHASISWA: ");
        String nama = scanner.nextLine();
        System.out.print("MASUKKAN NIM MAHASISWA: ");
        String nim = scanner.nextLine();
        while (nim.length() != 15) {
            System.out.println("PANJANG NIM HARUS 15 ANGKA!!!");
            System.out.print("MASUKKAN NIM MAHASISWA: ");
            nim = scanner.nextLine();
        }
        System.out.print("MASUKKAN JURUSAN MAHASISWA: ");
        String jurusan = scanner.nextLine();
        Mahasiswa mahasiswaUmm = new Mahasiswa(nama, nim, jurusan);
        mahasiswaUmmList.add(mahasiswaUmm);
        System.out.println("YEY, DATA KAMU BERHASIL DITAMBAHKAN :)");
    }

    public static void tampilDataMahasiswaUmm(List<Mahasiswa> mahasiswaUmmList) {
        for (Mahasiswa mahasiswaUmm : mahasiswaUmmList) {
            System.out.println(mahasiswaUmm.formatData());
        }
    }
}
