import java.util.Scanner;
public class bmi1{

public static void main(String args[]){
    Scanner w = new Scanner(System.in);
    System.out.println("enter weight in pounds");
    float m = w.nextFloat();
    w.close();

    Scanner hi = new Scanner(System.in);
    System.out.println("enter height in inches");

    
    float h = hi.nextFloat();
    //  float y = 0.3048f;
    float z = 0.0254f;
    float k = 0.453592f;
        // pound to kgs and inch to meter
    float l = h*z; 
    float x= m*k;
   
    float d = x/(l*l);  
    hi.close();

    System.out.println(m+ " mass in pounds,   "  +h+ " height in inch,   "  +l+  " height in meters,   "  +d+  " bmi ");
    }
}