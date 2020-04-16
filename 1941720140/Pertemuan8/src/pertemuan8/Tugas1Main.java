package Pertemuan8;
import java.util.Scanner;
public class Tugas1Main {
    public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);

        System.out.print("Masukkan kalimat\t: ");
        String klmt = sholikin.nextLine();
        String kata[] = klmt.split("\\s+");
        Tugas1 tumpukan = new Tugas1(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }

        tumpukan.print();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
