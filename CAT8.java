public class CAT8 extends TiketKonser { // subclass dari kelas TiketKonser
    //Do your magic here...
    public CAT8() {
       super("CAT 8"); // memanggil konstruktor superclass TiketKonser dengan parameter CAT 8
    }
 
    @Override // menyesuaikan kebutuhan method tanpa mengubah perilaku pada superclass
    public double getHarga() {
       return 1000000.0; // memberikan harga tiket CAT 8
    }
 }
 