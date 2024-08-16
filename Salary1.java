import java.util.*;
/**
 * Inheritance
 */
class Employee {

    String name;
    float basic;
    void getdata(){
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter the employees name : ");
        name = n.nextLine();
        System.out.print(" Enter the basic amount : ");
        basic = n.nextFloat();
        free(n);
    }
    private void free(Scanner n) {
    }
}
class Salary1 extends Employee{
    double da , hra , gross , net , pf;
    void calculate(){
        da = 0.50 *basic;
        hra = 0.10 * basic;
        gross = basic + da + hra;
        pf = 0.0833 * (basic + da);
        net = gross - pf;
    }
    void display(){
        System.out.println(" --------------------------------------");
        System.out.println(" The name of employee is : "+name);
        System.out.println(" The basic amount of "+name+" is : "+basic);
        System.out.println(" The gross profit of "+name+" is : "+gross);
        System.out.println(" The net profit of "+name+" is : "+net);
        System.out.println(" --------------------------------------");
    }
    
    public static void main(String[] args) {
        Salary1 ob = new Salary1();
        ob.getdata();
        ob.calculate();
        ob.display();
    }
}