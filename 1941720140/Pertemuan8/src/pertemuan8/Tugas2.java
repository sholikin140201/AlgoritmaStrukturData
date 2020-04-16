package Pertemuan8;
public class Tugas2 {
    int size, top;
    String data[];

    public Tugas2() {

    }
    public Tugas2(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public void print() {
        System.out.print("Kalimat Dibalik  : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
