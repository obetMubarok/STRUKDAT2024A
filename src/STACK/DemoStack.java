package STACK;
class MyStack{
    int size;//panjang array
    int top;//menunjuk data paling atas
    int[] array;

    public MyStack(int size) {
        this.size = size;
        top = -1;
        array = new int[size];
    }
    public void push(int newData){
        top++;//nilai top bertambah 1
        array[top] = newData;//simpan newData ke array index top
     
    }
    public int pop(){
        return array[top--];//mengembalikan data paling atas, selanjutnya top berkurang 1
    }
        
    public int peek(){
        return array[top];//mengembalikan data paling atas
    }
    public void display(){
        for(int i=0; i<=top; i++)
            System.out.print(array[i]+" ");
    }
    public void display2(){
        for(int i=0; i<size; i++){
            if(i<=top)
                System.out.println("tumpukan ke-"+(i+1)+" : "+array[i]+" ");
            else
                System.out.println("tumpukan ke-"+(i+1)+" : kosong");
        }
            
    }
    public void reset(){
        top = -1;//mengubah nilai top ke awal yaitu -1
    }
    public boolean isEmpty(){
         return top==-1;//mengembalikan true jika nilai top -1
    }
    public boolean isFull(){
        return top == size-1;//mengembalikan true jika nilai top = size-1
    }
}
public class DemoStack {
    public static void main(String[] args) {
        MyStack myS = new MyStack(10);
        myS.push(20);
        myS.push(10);
        myS.push(40);
        myS.push(30);
        myS.push(70);
        myS.push(80);
        
        //myS.pop();
        //System.out.println(myS.isFull());
        myS.display2();
        
    }
}
