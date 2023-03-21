class Product{

    int pcode;
    String  pname;
    int price;

    Product(int a,String b,int c){
        pcode=a;
        pname=b;
        price=c;
    }
    void display(){
        System.out.println("Product name :"+pname);
        System.out.println("Product code :"+pcode);
        System.out.println("Product price:"+price);
    }
}

class ProductMain{
    public static void main(String args[]){
        Product p1=new Product(1, "Pen",10);
        Product p2=new Product(2, "book",30);
        Product p3=new Product(3, "Scale",5);
        System.out.println("the Product with the lowest price is ");

        if(p1.price < p2.price)
            if(p1.price < p3.price)
                p1.display();
            else
                p3.display();
        else if( p3.price < p2.price)
            p3.display();
        else 
            p2.display();


        





    }

}