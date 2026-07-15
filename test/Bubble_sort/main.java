package Bubble_sort;

public class main{
    public static void main(String[] srg){
        process p = new process();


        
    p.add("Somchai","Sukjai","08123456789");
    p.add("Suda","Thongdee","0898765432");
    p.add("Anan","Kritsana","0823456789");
    p.add("Malee","Chaisri","0865432198");
    p.add("Kittipong","Boonsri","0834567890");
    p.add("Nattaporn","Wongchai","0854321987");
    p.add("Prasert","Jaidee","0845678901");
    p.add("Chanthira","Saengsuk","0876543210");
   

    //  p.insert(9, null, null, null);
    // p.editfisrtname("Somchai", "somporn");
    // p.edit_lastname("Thongdee", "fon");
    // p.edit_tel("0876543210","67676767676");

    p.bubble_sort();

    p.showall();
       
    }
    
}

