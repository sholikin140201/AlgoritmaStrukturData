package jobsheet2;
import java.util.Scanner;
public class kelimaMain {
    public static void main(String[] args){
    Scanner sholikin=new Scanner(System.in);
    kelima jg[]=new kelima[5];
    
    for (int i=0; i < jg.length; i++){
            System.out.print("Jajar Genjang ke "+(i+1));
            jg[i] = new kelima();
            System.out.println("Panjang : ");
            jg[i].panjang=sholikin.nextInt();
            System.out.println("Tinggi : ");
            jg[i].tinggi=sholikin.nextInt();
            System.out.println("Sisi Miring \t : ");
            jg[i].sisiMiring=sholikin.nextInt();
        }
        System.out.println("====================================");
        for (int i = 0; i<jg.length; i++){
            System.out.println("jajar genjang ke- "+(i+1));
            System.out.println("Panjang : "+jg[i].panjang);
            System.out.println("Tinggi : "+jg[i].tinggi);
            System.out.println("Sisi Miring : "+jg[i].sisiMiring);
            System.out.println("Luas : "+jg[i].luas());
            System.out.println("Keliling "+jg[i].keliling());
            System.out.println();
        }
}
}