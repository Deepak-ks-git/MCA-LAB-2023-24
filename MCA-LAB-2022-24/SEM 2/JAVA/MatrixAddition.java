import java.util.Scanner;

class MatrixAddition{

public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	
	int i,j;
	
	int a[][]=new int[5][5];
	int b[][]=new int[5][5];
	int c[][]=new int[5][5];
	

	System.out.println("enter the no of rows of matrix ");
	int m=s.nextInt();
	System.out.println("enter the no of columns of matrix");
	int n=s.nextInt();
	
	System.out.println("enter first matrix ");
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
			a[i][j]=s.nextInt();
	
	System.out.println("enter second matrix ");
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
			b[i][j]=s.nextInt();
			
	
	for(i=0;i<n;i++)
		for(j=0;j<m;j++)
			c[i][j]=a[i][j]+b[i][j];
			
	System.out.println("matrix A");
	for(i=0;i<n;i++){
		for(j=0;j<m;j++)
			System.out.print(a[i][j]+" ");
		System.out.println();
	
		}
	
	System.out.println("matrix B");
	for(i=0;i<n;i++){
		for(j=0;j<m;j++)
			System.out.print(b[i][j]+" ");
		System.out.println();
	
		}
		
		
		System.out.println("matrix C");
	for(i=0;i<n;i++){
		for(j=0;j<m;j++)
			System.out.print(c[i][j]+" ");
		System.out.println();
	
		}
		

	}
}





