package Study.Bubble_sort;

public class process {
    private String [] firstname = new String[10];
    private String [] lastname = new String[10];
    private String [] tel = new String[10];
    int size = 10;
    int count = 0;
    

   



    public void add(String name , String sername ,String number){
        if(!isfull()){
           firstname[count] = name;
           lastname[count] = sername;
           tel[count] = number;


            count++;
        }
        else{
            System.out.println("your phonebook is full");
        }
    }


    void delete(int k){
        if(!empty()){
            for(int p = k ; p < count ; p++){
                    firstname[p] = firstname[p+1];
                    lastname[p] = lastname[p+1];
                    tel[p] = tel[p+1];

                
            }
            count--;
        }
    }
    
    

   void editfisrtname(String name , String new_name){
    boolean found = false;
    for(int i = 0 ; i < count ; i++){
        if(firstname[i].equals(name)){
            firstname[i] = new_name;
            found = true;

        }
       
        
    }
        if(!found){
            System.out.println("i can't edit your firstname");
        }
   }

   void edit_lastname(String sername , String new_sername){
    boolean found = false;
    for(int i = 0 ; i < count ; i++){
        if(lastname[i].equals(sername)){
            lastname[i] = new_sername;
            found = true;
        }
       
        
    }
        if(!found){
             System.out.println("i can't edit your lastname");
        }
   }

   void edit_tel(String number , String new_number){
     boolean found = false;
    for(int i = 0 ; i < count ; i++){
        if(tel[i].equals(number)){
            tel[i] = new_number;
            found = true;
        }
        
        
    }
    if(!found){
             System.out.println("i can't edit your number");
        }
   }



    void insert(int k, String name , String sername ,String number){
         if(!empty()){
        for(int i = count ; i > k  ; i--){
            firstname[i] = firstname[i-1];
            lastname[i] = lastname[i-1];
            tel[i]= tel[i-1];

        }
        firstname[k]= name;
        lastname[k]=sername;
        tel[k]=number;

        count++;
    }
}
    

    boolean isfull(){
        return count == size;

    }
    boolean empty(){
        return count == 0;
    }

    void showall(){
        System.out.printf("%-5s %-15s %-15s %-15s\n", "| No.", "| Name ", "| Surname", "| Tel.         |");
       for (int i = 0; i < count; i++) {

           System.out.printf("  %-5s %-15s %-15s %-15s\n",i+1, firstname[i], lastname[i],tel[i]);

       }
    
}

    void bubble_sort(){
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j < count - i - 1 ; j++){
                if(firstname[j].compareTo(firstname[j+1])>0){
                    String temp1 = firstname[j];
                    firstname[j]= firstname[j+1];
                    firstname[j+1] = temp1;

                    String temp2 = lastname[j];
                    lastname[j]= lastname[j+1];
                    lastname[j+1] = temp2;

                    String temp3 = tel[j];
                    tel[j]= tel[j+1];
                    tel[j+1] = temp3;

                }
            }
        }
    }
}


