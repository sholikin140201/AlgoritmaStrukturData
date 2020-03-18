/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;
import java.util.Scanner;

/**
 *
 * @author Micin
 */
public class mainQuiz1 {
     public static void main(String[] args) {
        Scanner sholikin = new Scanner(System.in);                  // O(1)
        soal1 main1 = new soal1();                                  // O(1)
        soal2 main2 = new soal2();                                  // O(1)

        System.out.print("Masukan nama: ");                       // O(1)
        main1.nama = sholikin.nextLine();                           // O(1)
       
        main1.menghitungChar(main1.nama);                           // O(1)
        main2.perbandinganBF(main1.nama);                           // O(1)
        main2.perbandinganDC(main1.nama,0,main1.nama.length()-1);   // O(1)
       
        System.out.println("**********");                           // O(1)
        System.out.println("Abjad terkecil : "+ main2.small);       // O(1)
        System.out.println("Abjad terbesar : "+ main2.big);         // O(1)
    }
}
