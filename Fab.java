import java.util.*;
public class Fab{
    public static void main(String args[]){
        Scanner fact=new Scanner(System.in);
        System.out.println("enter the value of fibonacci series to: ");
        int f=fact.nextInt();
        int i;
        int p=0;
        int n=1;
        int q;
        fact.close();
        System.out.print(p+ " " +n+ " ");
        for(i=0; i<=f; i++){

            q=p+n;
            System.out.print(q+ " ");
            p=n;
            n=q;
          

        }
        
       


    }
}