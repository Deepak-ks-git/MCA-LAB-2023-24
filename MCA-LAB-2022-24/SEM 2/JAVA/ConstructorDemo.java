class Sum{
	int total,a,b;
	Sum(){
		a=10;
		b=5;
		System.out.println("inside constructor");
	}
	void add(){
		total=a+b;
		System.out.println(total);
	}
}


class ConstructorDemo2{
	public static void main(String args[])
	{	
		Sum s1=new Sum();
		s1.add();
	}


}
