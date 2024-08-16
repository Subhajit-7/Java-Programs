import java.util.*;
/**
 * Frequency
 */
class Frequency
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number=n.nextInt();
        int count,rem,temp;
        for(int i=0;i<=9;i++){
            count=0;
            temp=number;
            while(temp!=0){
                rem=temp%10;
                if(rem==i){
                    count++;
                }
                temp=temp/10;
            }
            if(count>0){
                System.out.println(" The frequency of "+i+" is : "+count);
            }
        }
        free(n);

    }

    public static void free(Scanner n) {
    }
}
