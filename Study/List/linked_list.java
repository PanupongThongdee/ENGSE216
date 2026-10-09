package Study.List;

public class linked_list {
    int count ;
    Node head,tail,travel,insert;


    void add(int item){
         Node nn = new Node();
         nn.info = item;

        if(count == 0){
            head = nn;
            tail = nn;
            
        }
        else{
            tail.link = nn;
            tail = nn;
            
           
            

        }
        count ++;
    }

    void addFirst(int item){
        if(count == 0){
            add(item);
        }
        else{
            Node nn = new Node(item);
            nn.link = head;
            head = nn;
            insert = nn;
            count++;
        }
    }

    void sert(int index,int item){
         if(count == 0){
            System.out.println("Node ก่อนหน้าต้องไม่เป็น null");
            return;
        }

        if(index < 0 || index > count){
            System.out.println("Error");
            return;
        }

        if(index == 0){
            addFirst(item);
            return;
        }

        if(index == count){
            add(item);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.link;
        }
        
            Node nn = new Node(item);
            nn.link = curr.link;
            curr.link = nn;
            count++;
        
    }






    void showall(){
        travel = head;

        for(int i = 0 ; i < count ; i++){
            System.out.println(travel.info +"");
            travel = travel.link;
        }
        System.out.println("=======================");
    }
}
