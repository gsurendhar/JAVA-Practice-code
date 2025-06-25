import java.util.*;

public class digits{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("Please Enter The non-negative Value");
        int m= num.nextInt();
        int a= m/100000%10;
        int b= m/10000%10;
        int c= m/1000%10;
        int d= m/100%10;
        int e= m/10%10;
        int f= m/1%10;
        num.close();
        


        System.out.println("value of integer = " +m);
        System.out.println("first digit   = " +a);
        System.out.println("second digit  = " +b);
        System.out.println("third digit   = " +c);
        System.out.println("fourth digit  = " +d);
        System.out.println("fifth digit   = " +e);
        System.out.println("sixth digit   = " +f);
        System.out.println(a+ " " +b+ " "+c+ " "+d+" "+e+ " "+f);


    }
}