import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("Data Mahasiswa");
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();
        }

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].getNim().equals(cariNim)) {
                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                daftar[i].updateIpk(ipkBaru);

                System.out.println("Data berhasil diperbarui!");
                System.out.println("Data Mahasiswa Setelah Update");
                daftar[i].tampilkanInfo();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }

        input.close();
    }
}