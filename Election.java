import java.util.*;
/**
 * Election
 */
public class Election {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int count[] = new int[6];
        for (int i = 0; i <= 5; i++) {
            count[i] = 0;
        }
        System.out.print(" Enter Total number of Ballet : ");
        int ballet =  n.nextInt();
        System.out.println(" ---------------------------------------------");
        System.out.println("\t\t-- BALLET PAPER --");
        System.out.println(" The Candidates are 1, 2, 3, 4, and 5 : ");
        for (int i = 0; i <= ballet-1; i++) {
            System.out.print(" Enter your vote : ");
            int vote = n.nextInt();
            if (vote == 1) {
                count[0]++;
            } else if (vote == 2) {
                count[1]++;
            } else if (vote == 3) {
                count[2]++;
            } else if (vote == 4) {
                count[3]++;
            } else if (vote == 5) {
                count[4]++;
            } else {
                count[5]++;
            }
        }
        System.out.println("\n -------------------------------------------");
        System.out.println(" Vote for Candidate No. [ 1 ] is : "+count[0]);
        System.out.println(" Vote for Candidate No. [ 2 ] is : "+count[1]);
        System.out.println(" Vote for Candidate No. [ 3 ] is : "+count[2]);
        System.out.println(" Vote for Candidate No. [ 4 ] is : "+count[3]);
        System.out.println(" Vote for Candidate No. [ 5 ] is : "+count[4]);
        System.out.println(" Vote belong to Spoilt Ballet is : "+count[5]);
        System.out.println(" ---------------------------------------------");
        free(n);
    }

    private static void free(Scanner n) {
    }
}