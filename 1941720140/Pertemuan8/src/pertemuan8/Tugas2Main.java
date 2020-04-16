package Pertemuan8;
import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String klmt = sholikin.nextLine();
        String kata[] = klmt.split("\\s+");
        Tugas2 tumpukan = new Tugas2(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }
        tumpukan.print();
    }
}
