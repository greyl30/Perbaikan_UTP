import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Do your magic here...
        Scanner scanner = new Scanner(System.in); // membuat object scanner untuk menerima inputan

        System.out.println("Selamat datang di Pemesanan Tiket!"); // menampilkan pesan selamat datang

        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine(); // membaca inputan nama pemesan

        // menmapilkan pilihan jenis tiket
        System.out.println("Pilih jenis tiket: ");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: ");
        int pilihanTiket = scanner.nextInt(); // membaca inputan jenis tiket yang dipilih

        String kodeBooking = generateKodeBooking(); // menghasilkan kode booking dengan memanggil method generateKodeBooking
        String tanggalPesanan = getCurrentDate(); // mendapatkan tanggal pemesanan dengan memanggil method getCurrentDate

        String namaTiket = ""; // variabel untuk menyimpan jenis tiket
        double totalHarga = 0; // varibael untuk menyimpan total harga 

        // membuat pilihan jenis tiket
        switch (pilihanTiket) {
            case 1:
                namaTiket = "CAT 8"; // jika memilih CAT 8
                totalHarga = new CAT8().getHarga(); // maka akan memanggil harga tiket CAT 8
                break;

            case 2:
                namaTiket = "CAT 1"; // jika memilih CAT 1
                totalHarga = new CAT1().getHarga(); // maka akan memanggil harga tiket CAT 1
                break;

            case 3:
                namaTiket = "FESTIVAL"; // jika memilih FESTIVAL
                totalHarga = new FESTIVAL().getHarga(); // maka akan memanggil harga tiket FESTIVAL
                break;

            case 4:
                namaTiket = "VIP"; // jika memilih VIP
                totalHarga = new VIP().getHarga(); // maka akan memanggil harga tiket VIP
                break;

            case 5:
                namaTiket = "UNLIMITED EXPERIENCE"; // jika memilih UNLIMITED EXPERIENCE (VVIP)
                totalHarga = new VVIP().getHarga(); // maka akan memanggil harga tiket VVIP
                break;
                
            default:
                System.out.println("Pilihan tiket tidak valid!"); // output bila inputan tidak sesuai
                return;
        }
        
        // menampilkan pesanan
        System.out.println("\n---- Detail Pemesanan ----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Tiket yang dipesan: " + namaTiket);
        System.out.println("Total harga: " + totalHarga + " USD");
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() { // definisi dari method generateKodeBooking
        StringBuilder sb = new StringBuilder(); // object untuk membuat kode booking
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // karakter yang digunakan dalam membuat kode booking
        int length = 8; // menentukan panjang kode booking

        for (int i = 0; i < length; i++) { // sebagai iterasi sebanyak panjang kode booking 
            int index = (int) (Math.random() * characters.length()); // menghasilkan kode secara random
            sb.append(characters.charAt(index)); // menambahkan karakter ke dalam StringBuilder
        }

        return sb.toString(); // mengambalikan kode booking sebagai string
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() { // definisi dari method getCurrentDate
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // object untuk memformat tanggal pemesanan
        Date currentDate = new Date(); // mendapatkan tanggal saat ini
        return dateFormat.format(currentDate); // memberikan tampilan tanggal yang telah diformat
    }
}