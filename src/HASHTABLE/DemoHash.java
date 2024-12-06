package HASHTABLE;
class MyHash{
    int maxSize;
    int[] array;

    public MyHash(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
    }
    public int hashFunction(int key){
        return key%maxSize;//
    }
    public void insert(int key){
        int index = hashFunction(key);//tentukan index
        array[index] = key;//simpan
    }
    public void insertOpenAdressing(int key){
        int index = hashFunction(key);
        if(array[index] == 0){//jika masih kosong
            array[index] = key;//simpan
        }else{//jika tidak kosong
            while(array[index]!=0){//diulang selama belum kosong
                index++;//index selanjutnya
            }
            array[index] = key;//simpan
        }
    }
    public void display(){
        int i;
        for(i=0; i<maxSize; i++){
            System.out.println("index "+i+" : "+array[i]);
        }
    }
    public boolean find(int key){
        boolean result = false;
        int index = hashFunction(key);
        if(array[index] == key)
            result = true;
        return result;
        //return array[hashFunction(key)] == key;
    }
    public boolean findOpenAdressing(int key){
        boolean result = false;
        int index = hashFunction(key);
        while(array[index] !=0){//diulang selama tidak kosong
            if(array[index] == key){//jika ketemu
                result = true;//ganti nilai result dengan true
                break;//hentikan perulangan
            }else{
                index++;
            }
        }
        return result;
    }
    
}
public class DemoHash {
    public static void main(String[] args) {
        MyHash h1 = new MyHash(10);
        
        h1.insert(19);
        h1.insert(10);//0
        h1.insertOpenAdressing(20);//1
        h1.insertOpenAdressing(30);//2
        
        System.out.println(h1.findOpenAdressing(40));
        
    }
}
