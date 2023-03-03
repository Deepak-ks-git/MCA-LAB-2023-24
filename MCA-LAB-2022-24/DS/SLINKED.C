#include<stdio.h>
#include<conio.h>

struct node{
    int data;
    struct node *next;
    };
    struct node* start;


    void beginsert(){
	struct node *ptr;
	int x;
	ptr=(struct node*)malloc(sizeof(struct node*));
	if(ptr==NULL)
	{
	    printf("overflow");

	}
	else {
	    printf("enter node value :");
	    scanf("%d",&x);
	    if(start==NULL){
		ptr->data=x;
		ptr->next=NULL;
		start=ptr;
	    }
	    else{
		ptr->data=x;
		ptr->next=start;
		start=ptr;
	    }
	}
    }

void lastinsert(){
	struct node *ptr,*temp;
	int x;
	ptr=(struct node*)malloc(sizeof(struct node*));
	if(ptr==NULL){
		printf("overflow");
		}
	else{
		printf("enter node value");
		scanf("%d",&x);
		ptr->data=x;
		if(start==NULL){
			ptr->next=NULL;
			start=ptr;
			}
		else{
		temp=start;
		while(temp->next!=NULL) {
		temp=temp->next; }
		temp->next=ptr;
		ptr->next=NULL;

		}

	}
}


void posinsert(){

	struct node *ptr,*temp;
	int i,x,pos;
	ptr=(struct node*)malloc(sizeof(struct node*));
	if(ptr==NULL){
		printf("cant insert"); }
	else{
		printf("enter the node value");
		scanf("%d",&x);
		printf("enter the postion");
		scanf("%d",&pos);
		ptr->data=x;
		temp=start;
		if(pos==1){
			if(start==NULL){
				ptr->next=NULL;
				start=ptr;
				}
			else{
			ptr->next=start;
			start=ptr;
			     }
			}

		else{
		      for(i=2;i<pos;i++)
		      {
			if(temp==NULL){
			return;
			}
			temp=temp->next;

		       }
		       ptr->next=temp->next;
		       temp->next=ptr;
		     }
		}


}


void begdel(){
	struct node *ptr;
	int x;
	if(start==NULL){
	printf("cant delete anymore") ;}
	else{
	ptr=start;
	start=ptr->next;
	x=ptr->data;
	free(ptr);
	printf("the node element %d is deleted",x);




	}

}




void lastdel(){
	struct node *ptr,*prev;
	int x;
	if(start==NULL){printf("%cant delete anymore"); }
	else if(start->next==NULL)
	{
	 x=start->data;
	 free(start);
	 printf("%d node is deleted",x);
	}
	else{
	ptr=start;
	while(ptr->next!=NULL){
		prev=ptr;
		ptr=ptr->next;
		}
		x=ptr->data;
		prev->next=NULL;
		free(ptr);
		printf("% d element deleted",x);
	}
}


void posdel(){
	struct node *ptr,*prev;
	int i,pos,x;
	ptr=start;
	if(ptr==NULL){
		printf("cant delete anymore");
	     }
	else{
		printf("enter the position to delete");
		scanf("%d",&pos);
		if(pos==1){
		   start=ptr->next;
		   x=ptr->data;
		   free(ptr);
		   printf("%d is deleted",x);
		    }
		else{
		   for(i=1;i<pos;i++)
		   {
		   prev=ptr;
		   ptr=ptr->next;
		   if(ptr==NULL){printf("cant delete anymore");return;
		    }
		    prev->next=ptr->next;
		    x=ptr->data;
		    free(ptr);
		    printf("element deleted is %d",x);
		   }

	}
}}


void search(){
	struct  node *ptr;
	int i=0,x,c=0;
	ptr=start;
	if(ptr==NULL){printf("item not found");}
	else{
		printf("enter the element to search");
		scanf("%d",&x);
		while(ptr!=NULL)
		{
		 if(ptr->data==x){
			printf("item found at position %d ",i+1);
			c=0; break;
			}
	      else
		 {
		 c=1;
		 }
		 ptr=ptr->next;
		 i++;
		}
		if(c==1)
		printf("item not found");
	}
}


void display(){
	struct node *ptr;
	ptr=start;
	if(ptr==NULL){printf("the list is empty");      }
	else{
	 while(ptr!=NULL){
	  printf("%d->",ptr->data);
	  ptr=ptr->next;
	 }
	 printf("NULL");
	}

}


int main(){
	int ch; clrscr();
	while(1){
	printf("1.insert at beg  2. insert at end  3.insert at position \n");
	printf("4.del at end   5. del at end   6.del at position \n");
	printf("7.search   8.display  9. exit \n enter your choice");
	scanf("%d",&ch);
	switch(ch){
		    case 1:beginsert();
				break;
		    case 2:lastinsert();
				break;
		    case 3:posinsert();
				break;
		    case 4:begdel();
				break;
		    case 5:lastdel();
				break;
		    case 6:posdel();
				break;

		    case 7:search();
				break;
		    case 8:display();
				break;

		    case 9:exit();
				break;
		    default:
				printf("invalid choice");
				break;




		   }
	}



}






