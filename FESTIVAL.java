class FESTIVAL extends TiketKonser { // subclass dari kelas TiketKonser
    //Do your magic here...
   public FESTIVAL() {
     super("FESTIVAL"); //memanggil konstruktor superclass TiketKonser dengan parameter FESTIVAL
   }
 
   @Override // menyesuaikan kebutuhan method tanpa mengubah perilaku pada superclass
   public double getHarga() {
     return 6000000.0; // memberikan harga tiket FESTIVAL
   }
  }
  