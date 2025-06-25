import java.util.Scanner;
public class days{

public static void main(String args[]){
    float m = 525600;

    Scanner min = new Scanner(System.in);
    System.out.println("enter the minutes");
    int n= min.nextInt();
    min.close();

   // (212°F − 32) × 5/9 = 100°C
    float c; 
    float y;
    float d;  
    float z;  
    y=n/m;
    d=n/1440;
    c=n%m;
    z=d%365;

    int yc = (int) y;
    System.out.println(y+ " year "  +d+ " days "  +c+  " no of days "  +z+  " no of years "+yc);
    }
}