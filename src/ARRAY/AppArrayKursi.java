package ARRAY;
class Kursi{
    String[] isiKursi;
    int size;

    public Kursi(int size) {
        this.size = size;
        isiKursi = new String[size];
    }
    public void addData(int index, String nama){
        if(isiKursi[index] == null)
            isiKursi[index] = nama;//data masuk
    }
    public void replaceData(int index, String nama){
        if(isiKursi[index] != null)
            isiKursi[index] = nama;
        else
            System.out.println("tidak terjadi replace");
    }
    public void remove(int index){
        isiKursi[index] = null;
    }
    public void show(){
        for(int i=0; i<size; i++){
            if(isiKursi[i] != null)
                System.out.print(isiKursi[i]+" ");
        }
    }
}
public class AppArrayKursi {
    public static void main(String[] args) {
        Kursi myRoom = new Kursi(10);
        myRoom.addData(0, "Iwan");
        //myRoom.replaceData(0, "Budi");
        //myRoom.replaceData(0, "Budi");
        //myRoom.remove(0);
        
        myRoom.show();
    }
    
}
