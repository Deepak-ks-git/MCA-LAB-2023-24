package graphics;
import java.util.*;
public class Circle implements Properties{
int radius;
public void area(){
Scanner sc=new Scanner(System.in);
System.out.println("enter radius");
radius=sc.nextInt();
System.out.println("Area ="+(3.14*radius*radius));
}
}

