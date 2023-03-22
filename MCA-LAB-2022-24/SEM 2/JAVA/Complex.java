import java.util.Scanner;

class Complex{
	
	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("First term\nenter real part");
	int r1=s.nextInt();
	System.out.println("imaginary part");
	int p1=s.nextInt();
	
	System.out.println("Second term\n enter real part");
	int r2=s.nextInt();
	System.out.println("imaginary part");
	int p2=s.nextInt();
	
	System.out.println("the sum of "+r1+"+"+p1+"i  and "+r2+"+"+p2+"i is :");
	System.out.println((r1+r2)+" + "+(p1+p2)+"i");
	
	
	}



}

