class VIP extends TiketKonser { // subclass dari kelas TiketKonser
    // Do your magic here... 
    public VIP() {
        super("VIP"); //memanggil konstruktor superclass TiketKonser dengan parameter VIP
    }

    @Override // menyesuaikan kebutuhan method tanpa mengubah perilaku pada superclass
    public double getHarga() {
        return 8000000.0; // memberikan harga tiket VIP
    }
 }
 