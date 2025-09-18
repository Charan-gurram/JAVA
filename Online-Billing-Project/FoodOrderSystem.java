import java.util.*;
abstract class Food
{
    String name;
    double baseprice;
    Food(String name ,double baseprice)
    {
        this.name=name;
        this.baseprice=baseprice;
    }
    abstract double calculatePrice();
}
class Pizza extends Food
{
    boolean extraTopping;
    Pizza(boolean extraTopping)
    {
        super("pizza",200);
        this.extraTopping=extraTopping;
    }
    double calculatePrice()
    {
            return baseprice+(extraTopping?40:0);
    }
}
class Burger extends Food
{
    boolean extraCheese;
    Burger(boolean extraCheese)
    {
        super("Burger",150);
        this.extraCheese=extraCheese;
    }
    double calculatePrice()
    {
        return baseprice+(extraCheese?60:0);
    }
}
class Drink extends Food
{
    String size;
    Drink(String size)
    {
        super("Drink",100);
        this.size=size;
    }
    double calculatePrice()
    {
        switch(size)
        {
            case "small":
                return baseprice+0;
            case "medium":
                 return baseprice+40;
            case "large":
                return baseprice+60;
            default:
                return baseprice;
        }
    }
}

class Customer
{
    private String name;
    private long mob_no;
    void setDetails(String name , long mob_no)
    {
            this.name = name;
            this.mob_no = mob_no;
    }
    void getDetails()
    {
        System.out.println("Customer name : "+name+" | phone: "+mob_no);
    }
}

interface Payment
{
    void pay(double amount);
}
class CardPayment implements Payment
{
    public void pay(double amount) 
    {
        System.out.println("Paid Rs." + amount + " using Card.");
    }
}
class UPI implements Payment
{
     public void pay(double amount) 
    {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}
class CashPayment implements Payment
{
     public void pay(double amount) 
    {
        System.out.println("Paid Rs." + amount + " thorugh cash on delivery.");
    }
}
class FoodOrderSystem
{
    public static void main(String[] args) 
    {
        Customer c =new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name");
        String cname = sc.nextLine();
        System.out.println("Enter Customer mobile.no");
        long mob_no=sc.nextLong();
        sc.nextLine();
        c.setDetails(cname, mob_no);
        List<Food> order = new ArrayList<>();
        //  System.out.println("Do you want to order");
        boolean ordering =true;
        while (ordering)
         {
            System.out.println("\nChoose item: ");
            System.out.println("1.Pizza  \n2.Burger  \n3.Drink  \n4.Done");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
             {
                case 1:
                    System.out.println("You have selected pizza");
                    System.out.println("Do you want extratopping ? ");
                    boolean extraTopping = sc.nextLine().equalsIgnoreCase("yes");
                    order.add(new Pizza(extraTopping));
                    break;
                case 2:
                    System.out.println("You have selected Burger");
                    System.out.println("Do you want extracheese ? ");
                    boolean extracheese = sc.nextLine().equalsIgnoreCase("yes");
                    order.add(new Burger(extracheese));
                    break;
                case 3:
                     System.out.println("You have selected Drink");
                     System.out.println("Do you want small /medium /large sized Drink ? ");
                     String size = sc.nextLine();
                     order.add(new Drink(size));
                     break;
                    case 4:
                      ordering=false;
                      break;
                default:
                        System.out.println("Invalid selection");
                        break;
            }             
        }
        c.getDetails();
            double total = 0;
            System.out.println("\n----- Order Summary -----");
            for (Food f : order)
            {
                double price = f.calculatePrice();
                total += price;
                System.out.println(f.name + " -> Rs." + price);
            }
            double tax = total * 0.05;
            total += tax;
            System.out.println("Total (incl. tax): Rs." + total);

            // Payment
            System.out.println("\nChoose Payment Method: ");
            System.out.println("1.Card  \n2.UPI  \n3.Cash");
            int pm = sc.nextInt();
            sc.nextLine();
            Payment payment;
            switch (pm) 
            {
                case 1: 
                    payment = new CardPayment();
                    break;
                case 2: 
                    payment = new UPI(); 
                    break;
                default: payment = 
                    new CashPayment(); 
                    break;
            }
            payment.pay(total);
    }
}