package jobsheet2;
public class kedua {
    String namaMember, namaGame;
    int id, hargaPinjam, lamaPinjam, total;
    
    void peminjam(){
        System.out.println("ID: "+id);
        System.out.println("Nama Member: "+namaMember);
        System.out.println("Nama Game: "+namaGame);
        System.out.println("Lama Peminjaman: "+lamaPinjam);
        System.out.println("Harga Sewa perhari: "+hargaPinjam);
    }
    
    void totalHarga(){
        total=lamaPinjam*hargaPinjam;
        System.out.println("Total Harga: "+total);
    }
}