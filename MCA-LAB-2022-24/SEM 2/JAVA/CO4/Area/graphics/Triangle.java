package graphics;
import java.util.*;
public class Triangle implements Properties{
int base;
int height;
public void area(){
Scanner sc=new Scanner(System.in);
System.out.println("enter base");
base=sc.nextInt();

System.out.println("enter height");
height=sc.nextInt();
System.out.println("Area ="+(0.5*base*height));
}
}

