import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee(int no, String na, double sal, String add) {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}

 class Teacher extends Employee {
    String dept;
    String subject;

    Teacher(int no, String na, double sal, String add, String dep, String sub) {
        super(no, na, sal, add);
        this.dept = dep;
        this.subject = sub;
    }

    void display() {
        System.out.println("Employee id: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }
}

class TeacherMain {
    public static void main(String[] args) {
        System.out.println("\nEnter the No. of Employee's");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Teacher arr[] = new Teacher[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Employee id: ");
            int Empid = sc.nextInt();
            System.out.println("\nEnter Employee Name: ");
            String Name = sc.next();
            System.out.println("\nEnter Salary: ");
            double Salary = sc.nextDouble();
            System.out.println("\nEnter Address: ");
            String Address = sc.next();
            System.out.println("\nEnter department: ");
            String dept = sc.next();
            System.out.println("\nEnter Subject: ");
            String subject = sc.next();
            arr[i] = new Teacher(Empid, Name, Salary, Address, dept, subject);

        }
        System.out.println("\n Employee Details ");
        for (int i = 0; i < num; i++) {
            arr[i].display();

        }
    }

}