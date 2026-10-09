package Lab.Sort_Data;

import java.util.Random; 

public class random_data {
    private int[] arr;
    
  
    public random_data(int size) {
        this.arr = new int[size];
        Random rand = new Random();
        
        for (int i = 0; i < size; i++) {
            this.arr[i] = rand.nextInt(size);
        }
    }
    

    public int[] Get_CopyArray() {
        return this.arr.clone(); 
    }
        
       
    
    public int[] Get_OriginalArray(){
        return this.arr;
    }



}
