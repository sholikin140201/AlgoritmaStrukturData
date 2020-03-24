package pertemuanke.pkg7;
import java.util.Scanner;
public class Tugas4 {
    int index=-1;
    public static void main(String[] args) {      
        Scanner sholikin = new Scanner (System.in);
        int jumlah;
        System.out.println("________________");
        System.out.print("Jumlah penduduk : ");
        jumlah = sholikin.nextInt();
        String data[][] = new String[jumlah][4];
        String ket [] ={"NIK","Nama","Alamat","Jenis Kelamin"};
        
        for(int a=0;a<jumlah;a++){
            System.out.println("Penduduk ke-"+(a+1));
            for(int i=0;i<ket.length;i++){
                System.out.print(ket[i]+" : ");
                data[a][i] = sholikin.next();
            }
            System.out.println("");
        }
        System.out.println("Masukkan data yang ingin dicari (Sesuai NIK) : ");
        String cari = sholikin.next();
        
        Tugas4 t4 =new Tugas4();
        t4.pencarian(data, cari);
        
        if(t4.index!=-1){
            for(int i=0;i<ket.length;i++){
                System.out.println(ket[i]+" : "+data[t4.index][i]);
            }
        }else{
            System.out.println("Maaf data tidak ditemukan!!");
        }
        
    }
    
    public void pencarian(String data[][],String cari){
        for(int a=0;a<data.length;a++){            
               if(cari.equals(data[a][0])){
                   index = a;
               }                        
        }
    }
}

