import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lapangan l1 = new Lapangan("L001", "Lapangan A", 75000);
        Lapangan l2 = new Lapangan("L002", "Lapangan B", 90000);
        Database.tambahLapangan(l1);
        Database.tambahLapangan(l2);

        System.out.println("== Selamat Datang di Sistem Reservasi Futsal ==");
        System.out.print("Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("No. HP: ");
        String hp = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, hp);

        System.out.println("== Pilihan Lapangan ==");
        Database.tampilkanLapangan();

        System.out.print("Pilih Kode Lapangan: ");
        String kode = input.nextLine();

        Lapangan dipilih = null;
        for (Lapangan l : Database.daftarLapangan) {
            if (l.getKode().equalsIgnoreCase(kode)) {
                dipilih = l;
                break;
            }
        }

        if (dipilih == null) {
            System.out.println("Kode tidak ditemukan.");
            input.close();
            return;
        }

        System.out.print("Durasi sewa (jam): ");
        int durasi = input.nextInt();

        Reservasi reservasi = new Reservasi(pelanggan, dipilih, LocalDateTime.now(), durasi);
        Database.tambahReservasi(reservasi);

        System.out.println("== Detail Reservasi ==");
        reservasi.tampilkanDetail();

        input.close(); // <=== Scanner ditutup untuk hilangkan warning
    }
}
