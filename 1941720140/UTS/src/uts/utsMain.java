package uts;
import java.util.Scanner;
public class utsMain {
    public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);
        int pilihan;
        char cari, yakin;

        uts prs = new uts();
        char[] dataNama = {'s', 'h', 'o', 'l', 'i', 'k', 'i', 'n'};
        int pjg = dataNama.length;

        do {
            System.out.println("Nama : \t Sholikin");
            System.out.println("NIM  : \t 1941720140\n");
            
            System.out.print("DATA : ");
            prs.tampil(dataNama);
            System.out.println("");
            
            System.out.println("Pilihan Metode Pencarian:");
            System.out.println("1. Sequential Search");
            System.out.println("2. Binary Search");
            System.out.println("");

            System.out.print("Pilih metode: ");
            pilihan = sholikin.nextInt();

            System.out.print("Data yang dicari: ");
            cari = sholikin.next().charAt(0);

            System.out.println("");
            
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil pencarian dengan Sequential Search: ");
                    prs.sort(dataNama, 0, pjg - 1);
                    prs.sequentialSearch(dataNama, cari);

                    System.out.print("Ada lagi? [Y/N] ");
                    yakin = sholikin.next().charAt(0);

                    break;
                case 2:
                    System.out.println("Hasil pengurutan data dengan Merge Sort: ");
                    prs.sort(dataNama, 0, pjg - 1);
                    prs.tampil(dataNama);

                    System.out.println("Hasil pencarian dengan Binary Search: ");
                    System.out.print("huruf " + cari + " ");
                    prs.keluar(dataNama, cari);
                    System.out.println("");

                    System.out.print("Ada lagi? [Y/N] ");
                    yakin = sholikin.next().charAt(0);

                    break;
                default:
                    System.out.println("Maaf inputan salah!");
                    System.out.print("Ada lagi? [Y/N] ");
                    yakin = sholikin.next().charAt(0);
            }
        } while (yakin == 'y' || yakin == 'Y');
    }
}
