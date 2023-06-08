import java.util.*;
class SearchFirst{
    Scanner sc=new Scanner(System.in);
    int x[];
    int n;
    SearchFirst(int n){
        this.n=n;
        x=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }

    }
    void search(int a,int x[]){
        for(int i=1;i<x.length;i++){
            if(a==x[i]){
                System.out.println("item found at position"+i);
                break;
            }
        }
        System.out.println("item not found");
    }

}
class SearchMain{
    public static void main(String args[]){
        SearchFirst sf=new SearchFirst(8);
        sf.search(5,sf.x);


    }
}