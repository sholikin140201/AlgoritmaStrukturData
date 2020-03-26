package pertemuan8;
import java.util.Scanner;
public class PostfixMain {
    public static void main(String[] args){
        Scanner sholikin = new Scanner(System.in);
        String P,Q;
        System.out.print("Masukkan Ekspresi matematika: ");
        Q = sholikin.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
