package pertemuanke.pkg7;
import java.util.Scanner;
public class Tugas2 {
    int posisi =-1;
    int posisi1 =-1;
    public static void main(String[] args) {        
        Scanner sholikin = new Scanner (System.in);
        int data[][] = {{45 , 78, 7, 200, 80},
                        {90, 1, 17, 100, 50},
                        {21, 2, 40, 18, 65}
                       };
        System.out.println("Data Awal :");
        Tugas2 t2 = new Tugas2();
        t2.TampilData(data);
        
        System.out.print("Masukkan Data Yang Ingin Dicari:");
        int cari = sholikin.nextInt();
        
        t2.FindSeqSearch(cari, data);
        t2.Tampilpoisisi(cari);
    }
    
     public void TampilData(int data[][]){
        for(int i=0;i<3;i++){
            for(int b=0;b<5;b++){
                System.out.print(data[i][b]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
     
     public int FindSeqSearch(int cari,int data[][]){
        
        for(int j=0;j<3;j++){
            for(int b=0;b<5;b++){
               if(data[j][b] == cari){
                    posisi = j ;
                    posisi1 = b ;
                    break;
                } 
            }            
        }
        return 0;
    }
     public void Tampilpoisisi(int x){
        if(posisi !=-1){
            System.out.println("data : "+x+" ditemukan pada indeks baris ke-"+posisi+" dan pada indeks kolom ke-"+posisi1);
        }else{
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }
}
