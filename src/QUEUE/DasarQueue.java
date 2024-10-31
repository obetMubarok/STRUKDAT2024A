package QUEUE;

import java.util.Arrays;

class MyQueue{
    int[] array;
    int maxSize;
    int front;
    int rear;
    int nItem;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = 0;
        rear = -1;
        nItem = 0;
    }
    public void insert2(int newData1, int newData2){
        insert(newData1);
        insert(newData2);
    }
    public void insert(int newData){
        if(nItem<maxSize){
            if(rear==maxSize-1)
                rear = -1;
            rear++;
            nItem++;
            array[rear] = newData;
        }
    }
    public void remove2(){
        //remove();
        //remove();
    }
    public int remove(){
        int removeData = 0;
        if(nItem == 0){
            rear = -1;
            front = 0;
        }else{
            removeData = array[front];
            nItem--;
            front++;
        }
        
        return removeData;
    }
    public int peekRear(){
        return array[rear];
    }
    public int peekFront(){
        return array[front];
    }
    public void display(){
        if(front>rear){//circular
            for(int i=front; i<maxSize; i++){
                System.out.print(array[i]+" ");
            }
        }
        front=0;
            for(int i=front; i<=rear; i++){
                System.out.print(array[i]+" ");
            }
            
        
            
    }
}
public class DasarQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(10);
        
        mq.insert(10);//0 120
        mq.insert(20);//1
        mq.insert(30);//2
        mq.insert(40);//3
        mq.insert(50);//4
        mq.insert(60);//5
        mq.insert(70);//6
        mq.insert(80);//7
        mq.insert(90);//8
        mq.insert(100);//9
        
        mq.remove();
        mq.insert(120);
        
        //System.out.println(mq.array[0]);
        mq.display();
        
    }
}
