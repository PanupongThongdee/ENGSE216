package Lab.phonebook;

public class Record {

   private String firstname;
   private String lastname;
   private String tel;


    
   Record(String name, String surname, String number) {
      setName(name);
      setSurname(surname);
      setTel(number);

   }

   public void setName(String name) {
      if (name != null && name.isEmpty()) {
         firstname = "unknow";
      } else {

         firstname = name;
      }
   }

   public void setSurname(String surname) {
      if (surname != null && surname.isEmpty()) {
         lastname = "unknow";
      } else {

         lastname = surname;
      }
   }

   public void setTel(String number) {
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
