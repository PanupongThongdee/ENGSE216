public class main {
    
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.showAll();
    }
}
