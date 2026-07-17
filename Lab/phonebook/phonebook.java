package Lab.phonebook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class phonebook {

    String name, surname, tel;
    Scanner input = new Scanner(System.in);
    boolean running = true;
    list l = new list();
    boolean isValid = false;
    int choice;

    public void run() {

        while (running) {
            menu();
            isValid = false;

            while (!isValid) {

                try {
                    choice = input.nextInt();
                    input.nextLine();
                    isValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("===============================================");
                    System.out.println("คุณกรอกตัวอักษรมา กรุณากรอกเฉพาะตัวเลขเมนูเท่านั้น");
                    input.next();
                    menu();
                }
            }
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

                    showAll_Data();
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
        System.out.println("เพิ่มข้อมูลเรียบร้อยแล้ว\n");
    }

    public void delete() {
        System.out.println("คุณเลือก ลบข้อมูล");
        System.out.println("กรอกช่องที่ต้องการลบ");
        try {
            int index_delete = input.nextInt();
            input.nextLine();

            l.delete(index_delete - 1);
        } catch (InputMismatchException e) {
            System.out.println("ช่องที่ต้องการลบต้องกรอกเป็นตัวเลขเท่านั้น\n");
            input.next();
        }
    }

    public void insert() {
        System.out.println("คุณเลือก แทรกข้อมูล");
        System.out.print("กรอกช่องที่ต้องการแทรก :");
        try {
            int index_insert = input.nextInt();
            input.nextLine();

            System.out.println("กรอกข้อมูลที่ต้องการแทรก");
            System.out.print("กรอกชื่อ: ");
            name = input.nextLine();

            System.out.print("กรอกนามสกุล: ");
            surname = input.nextLine();

            System.out.print("กรอกเบอร์โทร: ");
            tel = input.nextLine();



            l.insert(index_insert - 1, new Record(name, surname, tel));
            System.out.println("แทรกข้อมูลเรียบร้อย\n");
        } catch (InputMismatchException e) {
            System.out.println("ผิดพลาด! ช่องที่ต้องการแทรกต้องกรอกเป็นตัวเลขเท่านั้น\n");
            input.next();
        }
    }

    public void edit() {
        System.out.println("คุณเลือก แก้ไขข้อมูล");
        System.out.print("กรอกช่องที่ต้องการแก้ไข :");
        try {
            int index_edit = input.nextInt();
            input.nextLine();
            System.out.println("แก้ไข");
            System.out.print("กรอกชื่อ: ");
            name = input.nextLine();

            System.out.print("กรอกนามสกุล: ");
            surname = input.nextLine();

            System.out.print("กรอกเบอร์โทร: ");
            tel = input.nextLine();


            l.edits(index_edit - 1, new Record(name, surname, tel));
            System.out.println("แก้ไขข้อมูลเรียบร้อย\n");
        } catch (InputMismatchException e) {
            System.out.println("ช่องที่ต้องการแก้ไขต้องกรอกเป็นตัวเลขเท่านั้น\n");
            input.next();
        }

    }

    public void exit() {

        System.out.println("ออกจากโปรแกรม");
        running = false;

    }

    public void showAll_Data() {
        System.out.println("ต้องการเรียงข้อมูลไหมตอบ yes(y) or no(n) เท่านั้น");
        System.out.print("คำตอบ: ");
        String sort = input.nextLine();
        l.showall(sort);
    }
}
