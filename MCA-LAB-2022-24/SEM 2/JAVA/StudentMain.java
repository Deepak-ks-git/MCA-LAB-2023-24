class Student {
    int rollno;
    String name;
    int mark1, mark2;

    void getDetails(int rn, String name) {
        this.rollno = rn;
        this.name = name;
    }

    void getMarks(int m1, int m2) {
        this.mark1 = m1;
        this.mark2 = m2;
    }
}

interface Sports {
    int gracemark = 10;

    void getGraceMark();
}

class Result extends Student implements Sports {
    public void getGraceMark() {
        System.out.println("Grace mark awarded: " + gracemark);
    }

    void getResult() {
        System.out.println("ROLL NO: " + rollno);
        System.out.println("NAME: " + name);
        System.out.println("MARK 1: " + mark1);
        System.out.println("MARK 2: " + mark2);
        System.out.println("SPORTS MARK: " + gracemark);
        System.out.println("TOTAL MARK (Out of 100): " + (gracemark + mark1 + mark2));
    }
}

class StudentMain {
    public static void main(String args[]) {
        Result r = new Result();
        r.getDetails(10, "deepak");
        r.getMarks(40, 40);
        r.getGraceMark();
        r.getResult();
    }
}
