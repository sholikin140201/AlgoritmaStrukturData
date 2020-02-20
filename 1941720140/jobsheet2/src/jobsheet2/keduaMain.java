package jobsheet2;
import java.util.Scanner;
public class keduaMain {
    public static void main(String[] args){
        Scanner sholikin=new Scanner(System.in);
        Scanner micin=new Scanner(System.in);
        kedua pinjam=new kedua();
        
        System.out.print("Masukkan ID Member: ");
        pinjam.id=micin.nextInt();
        System.out.print("Masukkan Nama Member: ");
        pinjam.namaMember=sholikin.nextLine();
        System.out.print("Masukkan Nama Game: ");
        pinjam.namaGame=sholikin.nextLine();
        System.out.print("Masukkan Lama Peminjaman: ");
        pinjam.lamaPinjam=micin.nextInt();
        System.out.print("Masukkan Harga pinjaman perhari: ");
        pinjam.hargaPinjam=micin.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pinjam.peminjam();
        pinjam.totalHarga();
    }
}
