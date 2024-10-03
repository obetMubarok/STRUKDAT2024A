package ARRAY;

import java.util.ArrayList;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myData = new ArrayList();
        myData.add(2);
        myData.add(3);
        myData.add(4);
        //myData.clear();
        int nama = myData.get(0);
        
        
        System.out.println(myData.contains("Lala"));
    }
    
}
