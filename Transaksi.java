//Latihan 8
public class Transaksi {
    private int id;
    private String nama;
    private String judul_buku;
    private int jumlah;
    private String tgl_pinjam;
    private String tgl_kembali;
    

    public Transaksi(){
        System.out.println("Object telah diciptakan, constructor berjalan pada class transaksi");
    }


    public int getId(){
        return this.id;
    }

    public String getNama(){
        return this.nama;
    }

    public String getJudulBuku(){
        return this.judul_buku;
    }

    public int getJumlah(){
        return this.jumlah;
    }

    public String getTglPinjam(){
        return this.tgl_pinjam;
    }

    public String getTglKembali(){
        return this.tgl_kembali;
    }


    public void setId(int id){
        this.id = id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJudulBuku(String judul_buku){
        this.judul_buku = judul_buku;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public void setTglPinjam(String tgl_pinjam){
        this.tgl_pinjam = tgl_pinjam;
    }

    public void setTglKembali(String tgl_kembali){
        this.tgl_kembali = tgl_kembali;
    }


    public void cetakTransaksi(){
        System.out.println("Ini method untuk cetak transaksi peminjaman");
    }

    public void ubahJumlah(){
        System.out.println("Ini method untuk menambah jumlah buku");
    }

    public void ubahJumlah(int tambahan){
        jumlah = jumlah + tambahan;
        System.out.println("Jumlah : "+jumlah);
    }
}