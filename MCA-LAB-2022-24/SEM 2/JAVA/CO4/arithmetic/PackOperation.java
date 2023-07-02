import java.util.*;
import operations.Properties;
import operations.Addition;
import operations.Substract;
import operations.Multiply;
import operations.Division;

class PackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first operand");
        int a=sc.nextInt();
        System.out.println("enter second operand");
        int b=sc.nextInt();
        int choice;
        Addition obj1=new Addition();
        Substract obj2=new Substract();
        Multiply obj3=new Multiply();
        Division obj4=new Division();

        while (true) {
            System.out.println("Choose any: 1)Addition  2)Substraction  3)Multiply  4)Division  5)Exit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    obj1.calc(a, b);
                    break;
                case 2:
                    obj2.calc(a, b);
                    break;
                case 3:
                    obj3.calc(a, b);
                    break;
                case 4:
                    obj4.calc(a, b);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;  // Exit the main method, terminating the program
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

