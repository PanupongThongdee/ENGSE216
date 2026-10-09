package Lab.infix_to_postfix;

public class infix_to_postfix {

    private class stack {
        private char info;
        private stack next;

        public stack(char info) {
            this.info = info;
            this.next = null;
        }

    }

    private stack top = null;
    private int size = 0;

    public void push(char info) {
        stack newInfix = new stack(info);
        newInfix.next = top;
        top = newInfix;
        size++;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char item = top.info;
        top = top.next;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public char top() {
        if (isEmpty()) {
            return '\0';
        }
        return top.info;
    }

    private int precedence(char ch) {
        switch (ch) {
            
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            case '(': return -1;
            default : return -1;
        }
        
    }

    public String logic(String data) {


      if (data == null || data.trim().isEmpty()) {
        System.out.println("Error: Input is empty!");
        return "";
    }

   
   if (data.matches(".*[a-zA-Z\u0E00-\u0E7F].*")) {
        System.out.println("Error: Input contains alphabets! Numbers and operators only.");
        return "Error: Alphabets not allowed";
    }
        
        System.out.println("----------------------------------------");
        System.out.format("%-8s | %-15s | %-15s%n", "I/p", "O/p", "Stack");
        System.out.println("----------------------------------------");

        String result = "";


        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);

            if (c == ' ')
                continue;

            if (Character.isLetterOrDigit(c)) {
                result += c;
                printRow(String.valueOf(c),result);
            }

            else if (c == '(') {
                push(c);
                 printRow(String.valueOf(c),result);
            } else if (c == ')') {
                while (!isEmpty() && top() != '(') {
                    result += pop();
                     printRow(String.valueOf(c),result);
                }
                pop();
            }

            else {
                while (!isEmpty() && precedence(c) <= precedence(top())) {
                    result += pop();
                    printRow(String.valueOf(c),result);
                }
                push(c);
            }

        }
        while (!isEmpty()) {
            result += pop();
             printRow("",result);
        }

        return result;
    }

    private String getStackString() {
    if (isEmpty()) return " ";
    
    StringBuilder sb = new StringBuilder();
    stack current = top;
    while (current != null) {
        sb.insert(0, current.info); // เรียงข้อมูลจากล่างขึ้นบน
        current = current.next;
    }
    return  sb.toString() ;
}

    private void printRow(String input, String output) {
    System.out.format("%-8s | %-15s | %-15s%n", input, output,getStackString());
}



}
