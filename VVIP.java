class VVIP extends TiketKonser { // subclass dari kelas TiketKonser
    // Do your magic here...
   public VVIP() {
     super("UNLIMITED EXPERIENCE"); //memanggil konstruktor superclass TiketKonser dengan parameter UNLIMITED EXPERIENCE
 }
 
   @Override // menyesuaikan kebutuhan method tanpa mengubah perilaku pada superclass
   public double getHarga() {
       return 11000000.0; // memberikan harga tiket VVIP
   }
 }