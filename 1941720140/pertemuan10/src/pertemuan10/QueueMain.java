package pertemuan10;
import java.util.Scanner;
public class QueueMain {
    public static void main (String[] args){
        int pilih;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar !=0){
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
                    System.out.print("Masukkan Posisi Data Yang Anda Cari: ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
            
            case 7:
                    System.out.print("Data pada Antrian: ");
                    int antri = sc.nextInt();
                    Q.peekAt(antri);
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 4 || pilih == 4) ;
    }
    static void menu(){
        System.out.println("Masukkan operasi yang di inginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("---------------------------");
        }
}
