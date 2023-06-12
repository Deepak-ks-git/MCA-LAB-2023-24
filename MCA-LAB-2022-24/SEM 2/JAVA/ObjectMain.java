import java.util.Scanner;

interface Proto {
    void getData();
    void area();
    void perimeter();
}

class Circle implements Proto {
    double pi = 3.14;
    double r;
    Scanner sc = new Scanner(System.in);
    
    public void getData() {
        System.out.println("Enter the radius:");
        r = sc.nextDouble();
    }
    
    public void area() {
        System.out.println("Area of circle is: " + (pi * r * r));
    }
    
    public void perimeter() {
        System.out.println("Perimeter of circle is: " + (2 * pi * r));
    }
}

class Rectangle implements Proto {
    double l, b;
    Scanner sc = new Scanner(System.in);
    
    public void getData() {
        System.out.println("Enter the length:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth:");
        b = sc.nextDouble();
    }
    
    public void area() {
        System.out.println("Area of rectangle is: " + (l * b));
    }
    
    public void perimeter() {
        System.out.println("Perimeter of rectangle is: " + (2 * (l + b)));
    }
}

class ObjectMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Circle o = new Circle();
        Rectangle r = new Rectangle();
        
        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    o.getData();
                    o.area();
                    o.perimeter();
                    break;
                case 2:
                    r.getData();
                    r.area();
                    r.perimeter();
                    break;
                case 3:
                    System.out.println("Exited...");
                    System.exit(0);
            }
        } while (true);
    }
}

