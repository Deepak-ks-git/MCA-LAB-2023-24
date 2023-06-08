import java.util.*;
class Employee {
    public String name;
    public int eno;
    private float salary;

    Employee(int en, String n, float s) {
        eno = en;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Emp no: " + eno + "\tName: " + name + "\tSalary: " + salary);
    }
}

class EmpMain {
    public static void main(String[] args) {
        int n, i, sno, eno,flag=0;
        String name;
        float salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()

        Employee[] ob = new Employee[n];

        for (i = 0; i < n; i++) {
            System.out.println("Employee No: ");
            eno = sc.nextInt();
            sc.nextLine(); // Consume the newline character after nextInt()
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Salary: ");
            salary = sc.nextFloat();
            sc.nextLine(); // Consume the newline character after nextFloat()
            ob[i] = new Employee(eno, name, salary);
        }

        for (i = 0; i < n; i++)
            ob[i].display();

        System.out.println("enter the emp no to search");
        sno=sc.nextInt();
        for(i=0;i<ob.length;i++){
            if(ob[i].eno==sno){
                ob[i].display();
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("item not found");
        }
        sc.close();
    }
}