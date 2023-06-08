import java.util.*;
class SortDemo{
    Scanner sc=new Scanner(System.in);
    String x[];
    int n;
    SortDemo(){}
    SortDemo(int n){
        this.n=n;
        x=new String[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            x[i]=sc.nextLine();
        }
    }

    void sort(){
        String t="";
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        if(x[i].compareTo(x[j])>0){
        t=x[i];
        x[i]=x[j];
        x[j]=t;}}}
    }

    void view(){
        System.out.println("array");
        for(int i=0;i<n;i++)
        System.out.println(x[i]);
    }


}

class SortMain{
    public static void main(String args[])
    {
        SortDemo s=new SortDemo(5);
        s.sort();
        s.view();


    }

}

