abstract class TiketKonser implements HargaTiket { // kelas abstrak untuk mengimplementasikan harga tiket
    // Do your magic here...
    protected String jenis; // variabel untuk menyimpan jenis tiket

    public TiketKonser(String jenis) {
        this.jenis = jenis; // menginisialisasi jenis tiket 
    }

    public abstract double getHarga(); // kelas abstark untuk implementasi subclass
 }
 