package Lab.infix_to_postfix;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        infix_to_postfix infix_to_postfix = new infix_to_postfix();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number for Infix_To_PostFix");
        String expression = input.nextLine();

        
       System.out.println(infix_to_postfix.logic(expression));

        

        

    }
}
