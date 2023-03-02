#include<stdio.h>
#include<conio.h>

void main(){
       int a[20],n,i,c,pos;  
       clrscr();
       printf("enter array size \n");
       scanf("%d",&n);
       printf("enter the initial array elements \n");
       for(i=0;i<n;i++)
		{
		scanf("%d",&a[i]);
		}

       while(1){
		printf("\n Array Deletion \n 1. at Begining \n 2. at End");
		printf("\n 3. at Postion \n 4. Display \n 5. exit");
		printf("\nENTER YOUR CHOICE\n");
		scanf("%d",&c);
		switch(c){
			case 1:for(i=0;i<n;i++)
				a[i]=a[i+1];
				n--;
				break;
			case 2:a[n]=NULL;
				n--;
				break;
			case 3:printf("enter the position to delete\n");
				scanf("%d",&pos);
				if(pos<1){
					printf("cannot delete\n");break;
					}
				else if(pos-1>=n){
					printf("invalid position\n");
					break;
					}
				for(i=pos-1;pos<n;i++)
				{
					a[i]=a[i+1];
					}
				n--;
				break;
			case 4:for(i=0;i<n;i++)
				printf("\t%d",a[i]);
				break;
			case 5:exit();
			}



       }
}
getch();
