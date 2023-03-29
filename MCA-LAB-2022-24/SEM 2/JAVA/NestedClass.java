class Outer{

	void show(){
            
            System.out.println("this is inside Outer class");
            
	}
	
	
	
	
	class Inner{
	
		void display(){
		System.out.println("display from innner class");
		
		}
	
	}
	
	
	
	
	
	static class stat{
	
		static void print(){
	
			System.out.println(" this is static print method from static innner class");
			}
	
		void test(){
		
			System.out.println("this is in non static method from static inner class:");
		
			}
	
	
	}




}

class NestedClass{

	public static void main(String args[]){

	Outer o=new Outer();	

	o.show();

	Outer.Inner in=o.new Inner();
	
	in.display();
	
	Outer.stat.print();
	
	Outer.stat st=new Outer.stat();
	
	st.test();



	}

}






