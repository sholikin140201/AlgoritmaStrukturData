package quiz1;
import java.util.Scanner;
public class soal1 {
String nama;
   static void menghitungChar(String nama) {
        Scanner sholikin = new Scanner(System.in);
        char[] huruf = new char[nama.length()];
        int[] jumlahHuruf = new int[nama.length()];
        int jumlahHurufBerbeda = 1;
            huruf[0] = nama.charAt(0);
            jumlahHuruf[0] = 1;
           

            for (int i = 1; i < nama.length(); i++) {
                boolean sudahMuncul = false;
                for (int j = 0; j < jumlahHurufBerbeda; j++) {
                    if (nama.charAt(i) == huruf[j]) {
                        sudahMuncul = true;
                        jumlahHuruf[j] += 1;
                    }
                }
                if (!sudahMuncul) {
                    huruf[jumlahHurufBerbeda] = nama.charAt(i);
                    jumlahHuruf[jumlahHurufBerbeda] = 1;
                    jumlahHurufBerbeda++;
                }
            }
            System.out.println("\nHasil :");
            for (int i = 0; i < jumlahHurufBerbeda; i++) {
                System.out.println("Huruf " + huruf[i] + " : " + jumlahHuruf[i] + " buah");
            }
        }
    }