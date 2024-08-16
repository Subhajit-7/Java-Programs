import java.util.*;
/**
 * Vote
 */
public class Vote {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print(" Enter the number of voters: ");
        int voter=n.nextInt();
        int poll=(voter*80)/100;
        int vote_x=(poll*60)/100;
        int vote_y=(poll*40)/100;
        System.out.println(" The number of votes X gets is: "+vote_x+"\n");
        System.out.println(" The number of votes Y gets is: "+vote_y+"\n");
        free(n);
    }

    public static void free(Scanner n) {
    }
}