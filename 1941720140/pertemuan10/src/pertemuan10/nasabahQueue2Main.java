package pertemuan10;
import java.util.Scanner;
import pertemuan10.Queue;
import pertemuan10.Queue2;


public class nasabahQueue2Main {
    public static void menu() {
        System.out.println("Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. PeekRear");
        System.out.println("6. PeekPosition");
        System.out.println("7. PrintNasabah");
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak Nasabah: ");
        int n = sc.nextInt();
        Queue2 Q = new Queue2(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nomor Rekening baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
            
                case 5:
                    Q.peekRear();
                    break;
            
                case 6:
                    System.out.print("Masukkan Nama Nasabah Yang Anda Cari: ");
                    String cari = sc.nextLine();
                    Q.peekPosition(cari);
                    break;
            
            case 7:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int antri = sc.nextInt();
                    Q.printNasabah(antri);
                    break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih ==7);
    }
}