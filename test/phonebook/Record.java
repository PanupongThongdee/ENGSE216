package phonebook;

public class Record {

   private String firstname;
   private String lastname;
   private String tel;


    
   Record(String name, String surname, String number) {
      set_name(name);
      set_surname(surname);
      set_tel(number);

   }

   public void set_name(String name) {
      if (name != null && name.isEmpty()) {
         firstname = "unknow";
      } else {

         firstname = name;
      }
   }

   public void set_surname(String surname) {
      if (surname != null && surname.isEmpty()) {
         lastname = "unknow";
      } else {

         lastname = surname;
      }
   }

   public void set_tel(String number) {
      if (number != null && number.isEmpty()) {
         tel = "unknow";
      } else {

         tel = number;
      }
   }

   public Object getFirstname() {
      return firstname;
   }

   public Object getLastname() {
      return lastname;
   }

   public Object getTel() {
      return tel;
   }

}
