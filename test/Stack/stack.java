package Stack;

public class stack {
    private int arr[];
    int top = -1;

    stack(){
    //    arr = new int[5];
        this(5); //stack(5)
    }
    
    stack(int size){
        arr = new int[size];
    }

    
    void push(int item){
        if(isfull()){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = item;
        }
       
        
    }

    int top(){
        int temp;
        if(top < 0){
            System.out.println("is_empty");
           temp = -1;
        }
        else{
           temp = arr[top];  
        }
        return temp;
    }
    


    boolean isfull(){
        return top+1 == arr.length;
    }

    boolean isempty(){
        return top < 0;
    }

   


    int size(){
        return top+1 ;
    }

    int pop(){
        int temp = -1;
        if(isempty()){
            System.out.println("Stack is empty");
        }
        else{
            temp = arr[top];
            top--;
           
        }
         return temp;
    }
}
