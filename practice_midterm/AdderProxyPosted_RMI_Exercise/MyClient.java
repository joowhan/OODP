import java.rmi.*;
import java.util.Scanner;

public class MyClient {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int operand1 = 0;
        int operand2 = 0;
        try {
            
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println("Enter the Operation: 1 for Addition, 2 for Subtraction");
            option = sc.nextInt();
            System.out.println("Enter the 1st Operand");
            operand1 = sc.nextInt();
            System.out.println("Enter the 2nd Operand");
            operand2 = sc.nextInt();
            if(option==1){
                System.out.println(stub.add(operand1, operand2));
            }
            else if (option==2){
                System.out.println(stub.minus(operand1, operand2));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
