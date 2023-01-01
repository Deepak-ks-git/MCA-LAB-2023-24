#include<stdio.h>
#include<conio.h>

void main(){
	int s[6],x,i,c,top=-1,max=6;
	clrscr();
	while(1){
	printf("\n STACK");
	printf("\n 1. push ");
	printf("\n 2. pop");
	printf("\n 3. display");
	printf("\n 4. exit");
	scanf("%d",&c);
	switch(c){
	      case 1:if(top==max)
			{ printf("\n stack overflow "); break; }
		     printf("\n enter the value to be pushed ");
		     scanf("%d",&x);
		     s[top]=x;
		     top++;
		     break;
	      case 2:if(top<=-1)
			{printf("\n stack underflow"); break;}
		     printf("\n the value %d is popped out of stack ",s[top]);
		     s[top]=NULL;
		     top--;
		     break;
	      case 3:if(top>=0){
			printf("\n the stack elements ");
			for(i=6;i>=0;i--)
			printf("\t%d",s[i]);
			}
			else
		       {printf("\n the stack is empty");}
			break;
	      case 4:exit();


	     }
	}
}