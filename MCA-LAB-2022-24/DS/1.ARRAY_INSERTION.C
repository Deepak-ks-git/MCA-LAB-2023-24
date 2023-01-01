#include<stdio.h>
#include<conio.h>

void main(){

	int a[20],pos,val,s,i,n;
	clrscr();
	printf("enter the sizse of the initial array");
	scanf("%d",&n);
	printf("enter the array elements \n");
	for(i=0;i<n;i++)
		{
		scanf("%d",&a[i]);
		}
	while(1)
	{
	printf("\n ARRAY INSERTION");
	printf("\n 1. insert at begining");
	printf("\n 2. insert at end");
	printf("\n 3. insert at position");
	printf("\n 4. display \n 5. exit \n ENTER YOUR CHOICE\n");
	scanf("%d",&s);
	switch(s)
		{
		 case 1:printf("\n enter the number");
			scanf("\n%d",&val);
			n++;
			for(i=n;i>1;i--)
				{
				a[i-1]=a[i-2];
				}
			a[0]=val;
			n++;
			break;
		case 2:printf("\n enter the value");
			scanf("\n%d",&val);
			a[n]=val;
			n++;
			break;
		case 3:printf("\n enter the value");
			scanf("\n%d",&val);
		       printf("\n enter the position");
		       scanf("\n%d",&pos);
		       for(i=n-1;i>=pos-1;i--)
				{
				a[i+1]=a[i];
				}
		       a[pos-1]=val;
		       n++;
		       break;
		case 4:for(i=0;i<n;i++)
			printf("\t%d",a[i]);
			break;
		case 5:exit();
		default:printf("\n invalid choice ,please enter correct choice");
			break;

		}



	}


}
getch();