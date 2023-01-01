#include<stdio.h>
#include<conio.h>

void main(){
	int a[10],b[10],c[10],i,j,m,n,k=0;
	clrscr();
	printf("enter the first array size\n");
	scanf("%d",&n);
	printf("enter first sorted array \n");
	for(i=0;i<n;i++)
	       { scanf("%d",&a[i]); }
	printf("enter the second array size\n");
	scanf("%d",&m);
	printf("enter second sorted array \n");
	for(j=0;j<m;j++)
	       { scanf("%d",&b[j]); }

	for(i=0,j=0;k<m+n;)
		{
		if(a[i]<b[j])
			{
			c[k]=a[i];
			i++;
			k++;
			}
		else{
			c[k]=b[j];
			j++;
			k++;
		     }
	       }

	 printf("merged array\n");
	 for(i=0;i<k;i++)
	 printf("\t%d",c[i]);
	}
getch();