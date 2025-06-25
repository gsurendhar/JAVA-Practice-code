import java.util.*;
public class NaturalNumbers{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("enter number to calculate sum of natural numbers: ");
        int n = num.nextInt();
        int s=0;
        int i;
        num.close();
        for(i=0; i<=n; i++){
    
            s=s+i;
            System.out.println(s);
        }

        System.out.println("sum :  "  +s);

    }
}