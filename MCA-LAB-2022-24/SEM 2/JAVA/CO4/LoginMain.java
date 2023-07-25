import java.util.*;

class Validate extends Exception {
    Validate(String s) {
        super(s);
    }
}

public class LoginMain {
    public static void main(String args[]) {
        String uname, passwd;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your user name :");
            uname = sc.next();
            System.out.println("enter your password:");
            passwd = sc.next();
            check(uname, passwd);

        } catch (Validate v) {
            System.out.println("Invalid credentials" + v);
        }

    }

    static void check(String u, String p) throws Validate {
        if (u.equals("deepak") && p.equals("Deepak@123"))
            System.out.println("Login success");
        else
            throw new Validate("Incorrect password or username");
    }

}
