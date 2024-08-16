/**
 * Conditional
 */
public class Conditional {

    public static void main(String[] args) {
        int length=12;
        int breath=15;
        int perimeter,area;
        if (length>breath) {
            area=length*breath;
            System.out.println(" Area is : "+area);
        } else {
            perimeter=2*(length+breath);
            System.out.println(" Perimeter is :"+perimeter);
        }
    }
}