package graphics;
import java.util.*;
public class Rectangle implements Properties{
int length;
int breadth;
public void area(){
Scanner sc=new Scanner(System.in);
System.out.println("enter length");
length=sc.nextInt();

System.out.println("enter breadth");
breadth=sc.nextInt();
System.out.println("Area ="+(length*breadth));
}
}

