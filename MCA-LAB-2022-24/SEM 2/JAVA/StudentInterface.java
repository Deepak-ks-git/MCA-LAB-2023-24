import java.util.*;

class Student {
    int rollno;
    String name;

    void getData(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void putData() {
        System.out.println("Rollno=" + rollno);
        System.out.println("Name=" + name);
    }
}

class Test extends Student {
    int mark1, mark2;

    void getMarks(int mark1, int mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    void putMarks() {
        System.out.println("mark 1=" + mark1);
        System.out.println("mark 2=" + mark2);
    }
}

// definig interface
interface Sports {
    final float sprtmarks = 6.5f;

    void putSportsMarks();
}

class Score extends Test implements Sports {
    public void putSportsMarks() {
        System.out.println("sports weightage marks=" + sprtmarks);
    }

    void putTotalMarks() {
        float total = mark1 + mark2 + sprtmarks;
        System.out.println("total=" + total);
    }
}

class StudentInterface {
    public static void main(String args[]) {
        try {
            Scanner sc=new Scanner(System.in);
            Score s = new Score();
            System.out.println("enter rollno");
            int r = sc.nextInt();
            System.out.println("enter name");
            String n = sc.nextLine();
            s.getData(r, n);
            System.out.println("enter mark1");
            int m1 = sc.nextInt();
            System.out.println("enter mark2");
            int m2 =sc.nextInt();
            s.getMarks(m1, m2);
            s.putData();
            s.putSportsMarks();
            s.putTotalMarks();
        } catch (Exception e) {
        }
    }
}