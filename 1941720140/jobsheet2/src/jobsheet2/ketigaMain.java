package jobsheet2;
import java.util.Scanner;
public class ketigaMain {
    public static void main(String[] args){
        Scanner sholikin=new Scanner(System.in);
        ketiga barang=new ketiga();
        
        System.out.print("Masukkan Nama Barang: ");
        barang.nama=sholikin.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        barang.jumlah=sholikin.nextInt();
        System.out.print("Masukkan Harga Satuan: "); 
        barang.hargaSatuan=sholikin.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama: "+barang.nama);
        System.out.println("Jumlah: "+barang.jumlah);
        System.out.println("Harga Satuan: "+barang.hargaSatuan);
        System.out.println("Total Harga: "+barang.hargaTotal());
        System.out.println("Diskon: "+barang.diskon());
        System.out.println("Total Bayar: "+barang.hargaBayar());
        
    }
}
