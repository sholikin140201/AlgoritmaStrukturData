package pertemuan3;
import java.util.Scanner;
public class TUGASS3 {
    
    public String namaMhs;
    public int nilaiTugas,nilaiUas,nilaiUts,nilaiKuis;
    static double total,rata;

    public TUGASS3(String nama,int ntug,int nk,int nut,int una) {
        namaMhs = nama;
        nilaiTugas = ntug;
        nilaiKuis = nk;
        nilaiUts = nut;
        nilaiUas = una;
    }
    public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);
        Scanner micin = new Scanner(System.in);
        String nama;
        int ntug,nk,nut,una;
        double total = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int n = sholikin.nextInt();

        TUGASS3[] tn = new TUGASS3[n];             
        for(int i=0;i<n;i++){
            System.out.println("========================================");
            System.out.print("Nama Mahasiswa : ");
            nama = micin.next();            
            System.out.println("");
            System.out.println("========================================");
            System.out.println("Masukkan Nilai Mahasiswa  ");            
            System.out.print("Nilai Tugas   : ");
            ntug = sholikin.nextInt();
            System.out.print("Nilai Kuis    : ");
            nk = sholikin.nextInt();
            System.out.print("Nilai UTS     : ");
            nut = sholikin.nextInt();
            System.out.print("Nilai UAS     : ");
            una = sholikin.nextInt();
            System.out.println("========================================");
            tn[i] = new TUGASS3(nama, ntug, nk, nut, una);          
        }
        for(int i=0;i<n;i++){            
            System.out.println("");
            System.out.println("========================================");
            System.out.println("Nilai Keseluruhan Dari Mahasiswa Adalah");
            System.out.print("Nama Mahasiswa        : "+tn[i].namaMhs);
            System.out.println("");
            System.out.print("Total Nilai Adalah    : "+tn[i].TotalNilai());
            System.out.println("");
            System.out.println("========================================");  
        }
        double rata2= rata/n;
        System.out.println("");
        System.out.print("Rata-rata Nilai Mahasiswa Adalah "+rata2);
        System.out.println("");
        }
        public double TotalNilai(){
        nilaiTugas = (nilaiTugas*30)/100;
        nilaiKuis = (nilaiKuis*20)/100;
        nilaiUts = (nilaiUts*20)/100;
        nilaiUas = (nilaiUas*30)/100;
        total = nilaiTugas + nilaiKuis + nilaiUts + nilaiUas;
        rata += total;
        return total;
        }    
        }