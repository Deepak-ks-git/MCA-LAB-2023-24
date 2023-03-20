class Sum{
	static int check=0;
	int a,b,total;
	
	Sum(int x,int y){
	
		
		check++;
		
		a=x;
		
		b=y;
		
		System.out.println("inside constructor ");
	}
	
	void add(){
	
		total=a+b;
		
	}
	

}


class ThreeObjectCounter{

	public static void main(String args[])
	{	 
		int max;
		
		Sum s1=new Sum(105,5);
		
		Sum s2=new Sum(120,5);
		
		Sum s3=new Sum(110,5);
		
		s1.add();
		
		s2.add();
		
		s3.add();
		
		System.out.println(s1.total);
		
		System.out.println(s2.total);
		
		System.out.println(s3.total);
		
		if(s1.total>s2.total){
		 
		 max=s1.total;
		}
		
		else
		{
		
		max=s2.total;
		}
		
		if(max<s3.total)
		{
		
		max=s3.total;
		
		}
		
		
		System.out.println("largest of total is -"+max);
		System.out.println("no of objects created -"+Sum.check);

	}
	
}
	
	
	
	
	
	
	
	
	

