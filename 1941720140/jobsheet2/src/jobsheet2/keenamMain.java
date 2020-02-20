package jobsheet2;
import java.util.Scanner;
public class keenamMain {
    public static void main(String[] args){
        Scanner sholikin=new Scanner(System.in);
        System.out.println("Masukkan jumlah tanah: ");
        int jmlh=sholikin.nextInt();
        keenam tn[]=new keenam[jmlh];
        
        for(int a=0; a<tn.length; a++){
            System.out.print("Tanah ke-"+(a+1));
            tn[a]=new keenam();
            System.out.print("Panjang: ");
            tn[a].panjang=sholikin.nextInt();
            System.out.print("Lebar: ");
            tn[a].lebar=sholikin.nextInt();
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            System.out.println("Tanah ke-"+(a+1));
            System.out.println("Panjang: "+tn[a].panjang);
            System.out.println("Lebar: "+tn[a].lebar);
            System.out.println();
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            System.out.println("Luas Tanah "+(a+1)+" : "+tn[a].luasTanah());
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            int temp=0,tanah=0;
            System.out.println("Luas Tanah "+(a+1)+" : "+tn[a].luasTanah());
            if(tn[a].luasTanah() > temp){
                temp = tn[a].luasTanah();
                tanah = a + 1;
            }
            System.out.println();
            System.out.println("Tanah Terluas: Tanah "+tanah);
        }
    }
}
