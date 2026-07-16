package phonebook;

import java.util.Scanner;


public class Phonebook {    

    String name, surname, tel;
    Scanner input = new Scanner(System.in);
    boolean running = true;
    list l = new list();

    public void run() {
        
        while (running) {
            menu();
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:

                    add();// เพื่มข้อมูล
                    break;

                case 2:

                    delete();// ลบข้อมูล
                    break;
                case 3:

                    insert();// แทรกข้อมูล
                    break;
                case 4:

                    edit();
                    break;
                case 5:

                    ShowAll_Data();
                    break;
                case 0:

                    exit();
                    break;
                default:

                    System.out.println("เมนูไม่ถูกต้อง");
            }
            
        }

        

    }

    public void menu() {
        System.out.println("==== เมนู ====");
        System.out.println("1. เพิ่มข้อมูล");
        System.out.println("2. ลบข้อมูล");
        System.out.println("3. แทรกข้อมูล");
        System.out.println("4. แก้ไขข้อมูล");
        System.out.println("5. ดูรายชื่อ");
        System.out.println("6 เรียงข้อมูล");
        System.out.println("0. ออกจากโปรแกรม");
        System.out.print("เลือกเมนู: ");
    }

    public void add() {

        System.out.println("คุณเลือก เพิ่มข้อมูล");

        System.out.print("กรอกชื่อ: ");
        name = input.nextLine();

        System.out.print("กรอกนามสกุล: ");
        surname = input.nextLine();

        System.out.print("กรอกเบอร์โทร: ");
        tel = input.nextLine();

        l.add(new Record(name, surname, tel));


    }

    public void delete() {
        System.out.println("คุณเลือก ลบข้อมูล");
        System.out.println("กรอกช่องที่ต้องการลบ");
        int index_delete = input.nextInt();

        l.delete(index_delete-1);

    }

    public void insert() {
        System.out.println("คุณเลือก แทรกข้อมูล");
        System.out.println("กรอกช่องที่ต้องการแทรก");
        int index_insert = input.nextInt();
        input.nextLine();

        System.out.println("กรอกข้อมูลที่ต้องการแทรก");
        System.out.print("กรอกชื่อ: ");
        name = input.nextLine();

        System.out.print("กรอกนามสกุล: ");
        surname = input.nextLine();

        System.out.print("กรอกเบอร์โทร: ");
        tel = input.nextLine();


        l.insert(index_insert-=1, new Record(name, surname, tel));
    }

    public void edit() {
        System.out.println("คุณเลือก แก้ไขข้อมูล");
        System.out.println("กรอกช่องที่ต้องการแก้ไข");
        int index_edit = input.nextInt();
        input.nextLine();
        System.out.println("แก้ไข");
           System.out.print("กรอกชื่อ: ");
        name = input.nextLine();

        System.out.print("กรอกนามสกุล: ");
        surname = input.nextLine();

        System.out.print("กรอกเบอร์โทร: ");
        tel = input.nextLine();


        index_edit -= 1;
        l.edits(index_edit, new Record(name, surname, tel));
        

    }

    public void exit() {
        System.out.println("ออกจากโปรแกรม");
        running = false;
    }


    public void ShowAll_Data(){
        System.out.println("ต้องการเรียงข้อมูลไหมตอบ yes(y) or no(n) เท่านั้น");
        String sort = input.nextLine();
        l.showall(sort);
    }
}


