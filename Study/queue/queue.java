package Study.queue;

public class queue {

    int arr[] ;
    int f , r ;

    queue(int size) {
        arr = new int[size];
    }

    void enqueue(int item) {
        arr[r] = item;
        r = (r+1) % arr.length;
    }

    dequeue(){
        
    }


}
