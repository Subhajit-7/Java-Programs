import java.util.*;
/**
 * Sale
 */
class Product {

    int productNO;
    String name;
    int quantity;
    Scanner n = new Scanner(System.in);
    void getdata(){
        System.out.println("-----------------------------------------");
        System.out.print(" Enter the Product NO.: ");
        productNO = n.nextInt();
        System.out.print(" Enter the Name of the Product : ");
        name =n.next();
        System.out.print(" Enter the Quantity of the Product : ");
        quantity = n.nextInt();
    }
    void show(){
        System.out.println("-----------------------------------------");
        System.out.println(" Product Name : "+name);
        System.out.println(" Product Number : "+productNO);
        System.out.println(" Quantity : "+quantity);
    }
}

public class Sale extends Product {

    double rate;
    double amount;
    Scanner n = new Scanner(System.in);
    void input(){
        System.out.println("-----------------------------------------");
        System.out.print(" Enter rate of the item purchased : ");
        rate = n.nextDouble();
    }
    void calculate(){
        amount = rate*quantity;
    }
    void display(){
        System.out.println(" Amount to be paid : "+amount);
        System.out.println("-----------------------------------------");
    }
    public static void main(String[] args) {
        Sale ob = new Sale();
        ob.getdata();
        ob.input();
        ob.calculate();
        ob.show();
        ob.display();
    }
}