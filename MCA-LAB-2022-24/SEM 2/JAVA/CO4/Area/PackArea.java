import java.util.*;
import graphics.Properties;
import graphics.Rectangle;
import graphics.Circle;
import graphics.Triangle;
import graphics.Square;

class PackArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        Square obj3 = new Square();
        Triangle obj4 = new Triangle();
        
        while (true) {
            System.out.println("Choose any: 1)Circle  2)Rectangle  3)Square  4)Triangle  5)Exit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    obj1.area();
                    break;
                case 2:
                    obj2.area();
                    break;
                case 3:
                    obj3.area();
                    break;
                case 4:
                    obj4.area();
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


