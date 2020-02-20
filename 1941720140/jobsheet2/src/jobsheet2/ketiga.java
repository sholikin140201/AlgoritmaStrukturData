package jobsheet2;
public class ketiga {
    int hargaSatuan, jumlah;
    String nama;
    
    int hargaTotal(){
        return hargaSatuan*jumlah;
    }
    
    int diskon(){
        int total=hargaTotal();
        int diskon=0;
        if (total>100000){
            return diskon=total*10/100;
        }else if(total>=50000 && total<=100000){
            return diskon=total*5/100;    
        }else{
            return diskon;
        }
    }
    
    int hargaBayar(){
        int diskon=diskon();
        return hargaTotal()-diskon;     
    }
}