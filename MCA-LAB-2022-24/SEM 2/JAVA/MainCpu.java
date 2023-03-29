import java.util.Scanner;


class Cpu{

	int price;
	
	Scanner s=new Scanner(System.in);
	
	void get(){
	
		System.out.println("enter price :");
		
		price=s.nextInt();
	
		}
	
	void display(){
	
		System.out.println("cpu price :"+price);
	
		}
	
	
	
	
	class Processor{
	
		int numcores;
	
		String manufact;
	
		void get(){
	
			System.out.println("enter number of cores");
		
			numcores=s.nextInt();
		
			System.out.println("enter manufacturer name");
		
			manufact=s.next();
	
			}
	
		void display(){	
		
			System.out.println("number of cores :"+numcores);
		
			System.out.println("manufacturer name:"+manufact);
		
	
			}

		}
	
	static class Ram{
	
		int memory;
	
		String manufact;
			
		Scanner s=new Scanner(System.in);
	
		void get(){
	
			System.out.println("enter memory size");
			
			memory=s.nextInt();
			
			System.out.println("enter ram manufacturer");
			
			manufact=s.next();
			
			}
					
		void display(){	
		
			System.out.println("Ram size :"+memory);
		
			System.out.println("ram manufacturer name:"+manufact);
		
	
			}

	}
}


class MainCpu{

public static void main(String agrs[]){

	Cpu c=new Cpu();
	
	Cpu.Processor p=c.new Processor();
	
	Cpu.Ram r=new Cpu.Ram();
	
	c.get();
	
	p.get();
	
	r.get();
	
	c.display();
	
	p.display();
	
	r.display();
	
	







	}

}








