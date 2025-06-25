import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("enter the value of reversing the number : ");
        int number=n.nextInt();
        int reverse=0;
        int remainder=0;
        int temp=number;
        n.close();

        while(temp>0){
            remainder=temp%10;
            reverse=reverse*10+remainder;
            temp/=10;
            System.out.println(reverse);

        }
        System.out.println("reverse of " +number+ " is " +reverse);


    }
}