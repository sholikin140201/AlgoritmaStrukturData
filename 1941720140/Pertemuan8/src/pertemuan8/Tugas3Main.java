package Pertemuan8;
import java.util.Scanner;
public class Tugas3Main {
    public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);
        String P, ekspresi, eksp = "";
        System.out.print("Masukkan ekspresi matematika : ");
        ekspresi = sholikin.nextLine();
        for (int i = (ekspresi.length() - 1); i >= 0; i--) {
            eksp = eksp + ekspresi.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";

        int total = eksp.length();

        Tugas3 prefix = new Tugas3(total);
        P = prefix.konversi(eksp);
        System.out.println("Prefix : " + new StringBuffer(P).reverse());
    }
}
