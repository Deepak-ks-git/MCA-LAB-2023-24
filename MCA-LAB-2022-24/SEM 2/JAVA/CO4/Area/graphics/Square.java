package graphics;
import java.util.*;
public class Square implements Properties{
int side;
public void area(){
Scanner sc=new Scanner(System.in);
System.out.println("enter side");
side=sc.nextInt();
System.out.println("Area ="+(side*side));
}
}

