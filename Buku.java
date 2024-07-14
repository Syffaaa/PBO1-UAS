// Latihan 3
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;

    public Buku(){
        System.out.println("Object telah diciptakan, constructor berjalan pada class buku");
    }

    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getJumlahHalaman(){
        return this.jumlah_halaman;
    }

    public double getHarga(){
        return this.harga;
    }


    public void setId(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlah_halaman){
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }


    public void cetakBuku(){
        System.out.println("Ini method untuk cetak buku");
    }

    //Latihan 6
    public void naikkanHarga(){
        System.out.println("Ini method untuk menaikkan harga buku");
    }

    //Latihan 6
    public void naikkanHarga(double kenaikan){
        harga = harga + kenaikan;
        System.out.println("Harga : "+harga);
    }
}