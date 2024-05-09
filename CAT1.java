class CAT1 extends TiketKonser { // subclass dari kelas TiketKonser
    //Do your magic here...
   public CAT1() {
     super("CAT 1"); //memanggil konstruktor superclass TiketKonser dengan parameter CAT 1
    }
 
   @Override // menyesuaikan kebutuhan method tanpa mengubah perilaku pada superclass
   public double getHarga() {
     return 3000000.0; // memberikan harga tiket CAT 1
    }
  }