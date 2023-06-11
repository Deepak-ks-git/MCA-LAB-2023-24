
/* program to find area of reactanglr and square using method overloading*/
import java.util.*;

class Rectangle {
    int length, breadth;

    void getData(int l, int b) {
        this.length = length;
        this.breadth = breadth;
    }

    void getData(int lenth) {
        this.length = length;
    }

    int area(int l, int b) {
        return (l*b);
    }

    int area(int l) {
        return (l*l);
    }
}

class AreaMain {
    public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            Rectangle ra = new Rectangle();
            int ch = 0;
                System.out.println("1 .Rectangle");
                System.out.println("2 .square");
                System.out.println("3 .exit");
                System.out.println("enter your choice");
                ch =sc.nextInt();
                switch (ch) {
                    case 1: {

                        System.out.println("enter the length of rectangle : ");
                        int l =sc.nextInt();
                        System.out.println("neter the breadth of  rectangle : ");
                        int b =sc.nextInt();
                        ra.getData(l, b);
                        System.out.println("area of rectangle = " + ra.area(l, b));
                        break;
                    }
                    case 2: {

                        System.out.println("enter the side of the square : ");
                        int l = sc.nextInt();
                        ra.getData(l);
                
                        System.out.println("area of square=" +ra.area(l));
                        break;
                    }
                    case 3:
                        break;
                    default:
                        System.out.println("invalid choice");
                }
    }
}
