package arraybalok;
public class segitiga {
    
    public int alas, tinggi;
    
    public static void main (String[] args){
        segitiga[] sgtga=new segitiga[4];
        
        sgtga[0]=new segitiga(4, 10);
        sgtga[1]=new segitiga(20, 10);
        sgtga[2]=new segitiga(15, 6);
        sgtga[3]=new segitiga(25, 10);
        
        for (int i=0; i<4; i++){
            System.out.println("Luas: "+hitungLuas(sgtga[i].alas, sgtga[i].tinggi));
            System.out.println("Keliling: "+hitungKeliling(sgtga[i].alas, sgtga[i].tinggi));
        }
    }
    
    public segitiga(int x, int y){
        alas=x;
        tinggi=y;
    }
    int hitungLuas(int x, int y){
        return x*y/2;
    }
    double hitungKeliling(int x, int y){
        double a=new Double ((x*x)+(y*y));
        return (Math.sqrt(a)*2)+x;
    }
    }

