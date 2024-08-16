import java.util.*;
/**
 * EquableTriangle
 */
public class EquableTriangle {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Enter the three side of the triangle : ");
        double side1 = n.nextDouble();
        double side2 = n.nextDouble();
        double side3 = n.nextDouble();
        double perimeter = side1 + side2 + side3;
        double semiperi = perimeter / 2.0;
        double area = Math.sqrt(semiperi * (semiperi - side1) * (semiperi - side2) * (semiperi - side3));
        if (area == perimeter) {
            System.out.print(" The Triangle is Equable. ");
        } else {
            System.out.print("The Triangle is not Equable. ");
        }
        free(n);
    }

    private static void free(Scanner n) {
    }
}