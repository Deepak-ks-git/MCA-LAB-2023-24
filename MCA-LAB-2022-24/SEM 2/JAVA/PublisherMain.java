
class publisher {
    String pName;

    publisher(String nm) {
        pName = nm;
    }

    void display() {
        System.out.println("Publisher Name:" + pName);
    }
}

class book extends publisher {
    String bName;

    book(String pName, String bn) {
        super(pName);
        bName = bn;
    }

    void display() {
        super.display();
        System.out.println("Book Name:" + bName);
    }
}

class literature extends book {

    literature(String pName, String bName) {
        super(pName, bName);
    }

    void display() {
        super.display();
    }
}

class fiction extends book {
    String ficName;

    fiction(String pName, String bName) {
        super(pName, bName);
    }

    void display() {
        super.display();
    }
}

class PublisherMain {
    public static void main(String a[]) {
        literature l = new literature("Penguin", "The Great Gatsby");
        fiction f = new fiction("Bloomsberry", "Harry potter");
        l.display();
        f.display();
    }
}