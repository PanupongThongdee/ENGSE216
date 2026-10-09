
public class queue { //คิวแบบวน

    int q[] = new int[5];
    int f, r, count;

    void enqueue(int item) {
        if (!isFull()) {
            q[r] = item;
            r = (r + 1) % q.length;
            count++;
        } else {
            System.out.println("Queue is full");
        }

    }

    int dequeue() {
        int temp = -1;
        if (!isEmpty()) {
            temp = q[f];
            f = (f + 1) % q.length;
            count--;
        } else { 
            System.out.println("Queue is empty");
        }
        return temp;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    boolean isFull() {
        return size() == q.length;
    }

    int size() {
        return count;
    }

    void showAll() {
        int index;
        index = f;
        for (int i = 1; i <= count; i++) {
            System.out.print(q[index] + "  ");
            index = (index + 1) % q.length;
        }
    }
}
