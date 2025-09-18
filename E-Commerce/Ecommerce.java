import java.util.*;
class Product
{
    private int id;
    private String name;
    private double price;
    Product(int id ,String name ,double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }
        int getid()
        {
            return id;
        }
        String getname()
        {
                return name;
        }
        double getprice()
        {
            return price;

        }
        public double caldiscount()
        {
            return 0;
        }
}
class Electronics extends Product
{
    Electronics(int id, String name,double price)
    {
        super(id,name,price);
    }
        public double caldiscount()
        {
            return getprice()*0.10;
        }
}
class Clothing extends Product
{
    Clothing(int id, String name,double price)
    {
        super(id,name,price);
    }
    public double caldiscount()
    {
        return getprice()*0.20;
    }
}
class Grocery extends Product
{
    Grocery(int id, String name,double price)
    {
        super(id,name,price);
    }
    public double caldiscount()
    {
        return getprice()*0.15;
    }
}
abstract class Payment
{
    abstract void pay(double amount);
}
class CashonDelivery extends Payment
{
    void pay(double amount)
    { 
        System.out.println("Amount" +amount+" paid through CashonDelivery");
    }
}
class Cardpayment extends Payment
{
    void pay(double amount)
    { 
        System.out.println("Amount" +amount+" paid through CardPayment");
    }
}
class WalletPayment extends Payment
{
     public void pay(double amount)
    { 
        System.out.println("Amount" +amount+" paid through WalletPayment");
    }
}
class Cart
{
    private Product[] products;
    int count;
    Cart(int size)
    {
        products = new Product[size];
        count=0;
    }
    public void addProduct(Product p)
    {
        if(count<products.length)
        {
            products[count++]=p;
            System.out.println(p.getname()+"is added to cart");
        }
        else
        {
            System.out.println("cart is full");
        }
    }
    public void removeProduct(int id)
    {
        for(int i=0;i<count;i++)
        {
            if(products[i].getid()==id)
            {
                System.out.println(products[id].getname()+"removed succesfully from cart");
                for(int j=i;j<count-1;j++)
                {
                    products[j]=products[j+1];
                }
                products[count-1]=null;
                count--;
                return;
            }
        }
        System.out.println("product not found in the cart");
    }
    public double checkout()
    {
        double total =0;
        System.out.println("-----order summary------");
        for(int i=0;i<count;i++)
        {
            Product p=products[i];
            double discount = p.caldiscount();
            double finalprice =p.getprice()-discount;
            System.out.println(p.getname()+" | price: "+p.getprice()+"| Dicount : "+p.caldiscount()+" |final price : "+finalprice);
            total+=finalprice;
        }
        double tax=total*0.5;
        System.out.println("Added tax price: "+tax);
        return total+tax;
    }
}
public class Ecommerce
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Cart c =  new Cart(10);
        Product p1 = new Electronics(1, "mobile", 29999);
        Product p2= new Clothing(2, "Hoodies", 999);
        Product p3 =new Grocery(3, "Grrengram",150);
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p3);
        double totalbill = c.checkout();
        System.out.println("\n Choose Payment method \n 1. CashonDelivery \n 2 .Cardpayment \n 3 .Walletpayment");
        int choice =sc.nextInt();
        Payment pmt=null;
        switch(choice)
        {
            case 1: pmt=new CashonDelivery();
                break;
            case 2: pmt=new Cardpayment();
               break;
            case 3: pmt=new WalletPayment(); 
            break;
            default:
                System.out.println("Invalid selection");
            
        }
        pmt.pay(totalbill);
        sc.close();
        
    }
}