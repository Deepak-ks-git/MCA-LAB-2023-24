#include <stdio.h>
void main(){
    int high,mid,low,n,i,k;
    int a[10];
    printf("enter the size of array");
    scanf("%d",&n);
    printf("enter the elements");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    low=0;
    high=n-1;
    mid=high+low/2;
    printf("enter the element to search");
    scanf("%d",&k);
    while(low<=high){
        if(a[mid]<k)
        low=mid+1;
        else if(a[mid]==k){
            printf("item found at position %d",mid+1);
            break;}
    
        else
        high=mid-1;
        mid=high+low/2;
        
    }
    if(high>high){
        printf("cant search");
    }
    
}
