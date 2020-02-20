package jobsheet2;
import java.util.Scanner; 
public class keempatMain {
   public static void main(String[] args){
    Scanner irul = new Scanner(System.in);
        keempat PCM = new keempat();
        System.out.print("Masukkan koordinat x: ");
        PCM.x = irul.nextInt();
        System.out.print("Masukkan koordinat y:  ");
        PCM.y = irul.nextInt();
        System.out.print("Masukkan width: ");
        PCM.width = irul.nextInt();
        System.out.print("Masukkan height: ");
        PCM.height = irul.nextInt();
        
        PCM.moveLeft();
        PCM.moveRight();
        PCM.moveUp();
        PCM.moveDown();
    }
}
