class Sum{

	int a,b;
	
	Sum(int x,int y){
	
		a=x;
		
		b=y;
		
		System.out.println("inside constructor");
	}
	
	int add(){
	
		return(a+b);
		
	}
}


class ConstructorDemo2{

	public static void main(String args[])
	{	 
		int total;
		
		Sum s1=new Sum(10,5);
		
		total=s1.add();
		
		System.out.println(total);
	}


}
