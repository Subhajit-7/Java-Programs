import java.util.*;
/**
 * Merge_array
 */
public class Merge_array {

    public static void main(String[] args) {
        int A[] = {3, 6, 2, 8, 5};
        Arrays.sort(A);
        int B[] = {4, 1, 9, 6, 7};
        Arrays.sort(B);
        int C[] = new int[A.length + B.length];
        int i=0,j=0,k=0;
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
        Arrays.sort(C);
        System.out.print(" Array after merging : ");
        for (int k2 = 0; k2 < C.length; k2++) {
            System.out.print(C[k2]+" ");
        }
    }
}