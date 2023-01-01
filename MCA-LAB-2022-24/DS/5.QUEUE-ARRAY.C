#include<stdio.h>
#include<conio.h>

void main(){
	int q[10],s=10,f=-1,r=-1,c,x,i;
	clrscr();
	while(1){
	 printf("\n QUEUE");
	 printf("\n 1. enqueue");
	 printf("\n 2. dequeue");
	 printf("\n 3. display");
	 printf("\n 4. exit");
	 printf("\n Enter Your Choice");
	 scanf("%d",&c);
	 switch(c){
		  case 1:if(r==s-1)
			 printf("\n Overflow");
			 else{
			 if(f==-1)
			 f=0;
			 printf("\n enter the element to be inserted");
			 scanf("%d",&x);
			 r++;
			 q[r]=x;
			 }
			 break;
		  case 2:if(f==-1||f>r)
			 { print("\n Underflow"); }
			 else {
			 printf("\n elements deleted from the queue %d",q[f]);
			 f++;
			 }
			 break;
		  case 3:if(f==-1)
			{ printf("queue is empty");}
			else
			{
			 printf("\n queue ");
			 for(i=f;i<=r;i++)
			 printf("\t%d",q[i]);
			}
			break;

		 }
	}
}
getch();
