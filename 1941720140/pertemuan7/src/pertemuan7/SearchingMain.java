package pertemuan7;
import java.util.Scanner;
public class SearchingMain {
    public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        int dataB[] = {100, 90, 80, 70, 60, 50, 40, 30};
        int cari;
        Searching pencarian = new Searching(data, 8);
        Searching pencarianB = new Searching(dataB, 8);
        
        System.out.println("Isi Array Sequential: ");
        pencarian.TampilData();
        System.out.println("Isi Array Binary: ");
        pencarianB.TampilData();
        System.out.println("");
        System.out.print("Masukkan data yang ingin dicari: ");
        cari=sholikin.nextInt();
        
        System.out.println("Menggunakan sequential search");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1){
            System.out.println("Data: " + cari + " ditemukan pada indeks " + posisi);
        }else {
            System.out.println("Data: " + cari + " tidak ditemukan ");
        }
        
        int posisiB=pencarianB.FindSeqSearch(cari);
        System.out.println("==============================");
        System.out.println("Menggunakan binary search");
        pencarianB.TampilPosisi(cari, posisi);
    }
}
