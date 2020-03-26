package pertemuan8;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args){
        Scanner sholikin = new Scanner(System.in);
        Stack tumpukan = new Stack(4);
    
        for (int i=0; i<tumpukan.data.length; i++){
            System.out.print("Masukkan tumpukan ke-"+(i+1)+" :");
            tumpukan.data[i] = sholikin.nextInt();
            tumpukan.push(tumpukan.data[i]);
        }
        
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}