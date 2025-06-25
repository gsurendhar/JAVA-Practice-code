import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner fact=new Scanner(System.in);
        System.out.print("enter the value of factorial: ");
        int f=fact.nextInt();
        int i;
        int p=1;
        fact.close();
        for(i=1; i<=f; i++){
            p=p*i;
            System.out.println(p);

        }
        System.out.println("factotial of "+f+ " is = "  +p);


    }
}