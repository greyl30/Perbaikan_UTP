class PemesananTiket {
    // Do your magic here...
   private String namaPemesan; // variabel untuk menyimpam nama pemesan
   private String kodeBooking; // variabel untuk menyimpam kode booking
   private String tanggalPesanan; // variabel untuk menyimpam tanggal pemesanan
   private String namaTiket; // variabel untuk menyimpam nama tiket
   private double totalHarga; // variabel untuk menyimpam total harga
 
   public PemesananTiket(String namaPemesan, String kodeBooking, String tanggalPesanan, String namaTiket, double totalHarga) {
     this.namaPemesan = namaPemesan; // menginisialisasi nama pemesan
     this.kodeBooking = kodeBooking; // menginisialisasi kode booking
     this.tanggalPesanan = tanggalPesanan; // menginisialisasi tanggal pemesanan
     this.namaTiket = namaTiket; // menginisialisasi nama tiket
     this.totalHarga = totalHarga; // menginisialisasi total harga
   }
 
   // memberikan nilai ketika method get dipanggil 
   public String getNamaPememsan() {
     return namaPemesan;
   }
 
   public String getKodeBooking() {
     return kodeBooking;
   }
 
   public String getTanggalPesana() {
     return tanggalPesanan;
   }
 
   public String getNamaTiket() {
     return namaTiket;
   }
 
   public double getTotalHarga() {
     return totalHarga;
   }
 
  // mencetak nota pembelian tiket
   public void cetakNota() {
     System.out.println("\n---- Detail Pemesanan ----");
     System.out.println("Nama Pemesan: " + namaPemesan);
     System.out.println("Kode Booking: " + kodeBooking);
     System.out.println("Tanggal Pesanan: " + tanggalPesanan);
     System.out.println("Tiket yang dipesan: " + namaTiket);
     System.out.println("TOtal harga: " + totalHarga + "USD");
   }
  }