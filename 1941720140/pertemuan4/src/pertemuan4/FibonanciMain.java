package pertemuan4;
import java.util.Scanner;
        public class FibonanciMain {
     public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);
        Fibonanci fb = new Fibonanci();
        System.out.print("Masukkan angka: ");
        fb.angka = sholikin.nextInt();

        fb.hitungFiboBF();
        System.out.println("");
        for (int i = 0; i < fb.angka; i++) {
            System.out.print(fb.hitungFiboDC(i)+" ");
        }
    }
}

