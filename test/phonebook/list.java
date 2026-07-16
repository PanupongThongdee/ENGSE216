package phonebook;

public class list {
    private Record profile[] = new Record[5];
    private int count = 0;
    private Record temp;

    public void add(Record data) {
        if (!isfull()) {
            this.profile[count] = data;
            count++;
        } else {
            System.out.println("your phonebook is full");
        }
    }

    void delete(int k) {
        if (!empty()) {

            if (k < 0 || k >= count) {
                System.out.println("Invalid index.");
                return;
            }
            for (int p = k; p < count; p++) {
                this.profile[p] = profile[p + 1];

            }
            count--;
        }
    }

    public void edits(int k, Record profile) {

        if (k >= 0 && k < count) {
            this.profile[k] = profile;
            System.out.println("edit Success");
        } else {
            System.out.println("Index out of bounds!");
        }
    }

    public void insert(int k, Record profile) {

        if (!isfull()) {

            for (int i = count; i > k; i--) {

                this.profile[i] = this.profile[i - 1];

            }
            this.profile[k] = profile;
            count++;
        }
    }

    boolean isfull() {
        return count == this.profile.length;

    }

    boolean empty() {
        return count == 0;
    }

    void bubble_sort() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (this.profile[j] == null || this.profile[j + 1] == null) {
                    continue;
                }

                String currentName = (this.profile[j].getFirstname() + " " + this.profile[j].getLastname())
                        .toUpperCase();
                String nextName = (this.profile[j + 1].getFirstname() + " " + this.profile[j + 1].getLastname())
                        .toUpperCase();

                if (currentName.compareTo(nextName) > 0) {

                    Record temp = this.profile[j];
                    this.profile[j] = this.profile[j + 1];
                    this.profile[j + 1] = temp;
                }
            }
        }
    }

    void showall(String sort) {

        
        for (int i = 0; i < count; i++) {

            if (profile[i] != null) {

              if (sort != null && (sort.equalsIgnoreCase("y") || sort.equalsIgnoreCase("yes"))) {
                     bubble_sort(); 
                 }
            else{
                System.out.println("กรุณากรอกแค่ yes(y) กับ no(n) เท่านั้น");
                return;
            }

            System.out.printf("%-5s %-15s %-15s %-15s\n", "| No.", "| Name ", "| Surname", "| Tel.         |");
                    
}
                    System.out.printf("  %-5s %-15s %-15s %-15s\n", 
                    i + 1, 
                    this.profile[i].getFirstname(),
                    this.profile[i].getLastname(),
                    this.profile[i].getTel());
                }

                
                  
                
            }
        }



