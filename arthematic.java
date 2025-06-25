import java.util.*;

public class arthematic {
    public static void main(String []args){

        Scanner n1 = new Scanner(System.in);
        System.out.println("enter the first value");
        int a =n1.nextInt();

        Scanner n2 = new Scanner(System.in);
        System.out.println("enter the second value");
        int b =n2.nextInt();

        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=(a+b)/2;
        int g=a-b;
        int h=Math.max(a,b);
        int i=Math.min(a,b);

        System.out.println("Addition : " +c);
        System.out.println("Subtration : " +d);
        System.out.println("Product : " +e);
        System.out.println("Average : " +f);
        System.out.println("Distance between numbers : " +g);
        System.out.println("Maxmuium : " +h);
        System.out.println("Minium : " +i);
        n1.close();
        n2.close();


    
    }


}