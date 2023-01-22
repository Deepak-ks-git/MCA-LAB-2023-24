#include<stdio.h>
#include<conio.h>
int a[10],front=-1,rear=-1,n;
void insert(){
	int x;
	if((front==0 && rear==n-1)||(front==rear+1))
	{
		printf("the queue is full");
		}
	else{
		printf("enter the element to be inserted");
		scanf("%d",&x);
		if(front==-1 && rear==-1)
		{front=rear=0; }
		else if(rear==n-1 && front!=0)
		{rear=0; }
		else   {
		rear=(rear+1)%n;}
		a[rear]=x;
		}
	}

void deletion(){
	if(front==-1)
	printf("the queue is empty");
	else{
		printf("deleted element :%d",a[front]);
	if(front==rear)
	front=rear=-1;
	else{
			if(front==n-1)
			front=0;
			else
			front+=1;
		}
       }
}

void display(){

	int i;
	if(front==-1)
	printf("the queue is empty");
	else if(front<=rear){
		for(i=front;i<=rear;i++)
		printf("%d",a[i]);
		}
	else{
		for(i=front;i<n;i++)
		printf("%d",a[i]);
		for(i=0;i<=rear;i++)
	printf("%d",a[i]);
	}

}

void search(){
	int c,i,j,x;
	printf("enter the element to be searched");
	scanf("%d",&x);
	if(front<=rear){
		int f1=0;
		for(i=front;i<=rear;i++)
		if(a[i]==x) {
			printf("element found at position %d",i);
			f1=1;
			break;
			}
	       if(f1==0)
	       printf("element not found");
	       }

	else{
	       int f=0;
	       for(i=front,j=1;i<n;i++,j++)
	       if(a[i]==x){
			f=1;
			printf("element found at position :%d",j);
			break;
			}

	if(f==0){
		int f2=0;
		for(i=0;i<rear;i++)
			if(a[i]==x){
				printf("element found at position :%d",i+n-1);
				f2=1;
				break;
				}
			if(f2==0)
			printf("element not found");
		}

}

}



void main(){
	char ch;
	clrscr ();
	printf("enter the size of queue\n");
	scanf("%d",&n);
	while(1){
		printf(" \n 1.Insertion");
		printf(" \n 2.Deletion");
		printf(" \n 3.Display");
		printf(" \n 4.Search");
		printf(" \n 5.Exit");
		scanf("%s",&ch);
		switch(ch){
		case '1':insert();
			break;
		case '2':deletion();break;

		case '3':display();
			break;
		case '4':search();
			break;
		case '5':exit();
		default:printf("invalid choice");
			break;
		}
	 }

}
 getch();