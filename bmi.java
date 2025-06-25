import java.util.Scanner;
public class bmi{

public static void main(String args[]){

    Scanner we = new Scanner(System.in);
    System.out.println("enter the weight in kgs");
    float m = we.nextFloat();
    we.close();

    Scanner he = new Scanner(System.in);
    System.out.println("enter the height in feets");
    float h = he.nextFloat();
    float y = 0.3048f;
    he.close();
   // float z = 0.0254f;
        // feet to meters and kgs
    float l = h*y; 
   
    float d = m/(l*l);  

    System.out.println(m+ " mass in kgs,  "  +h+ " height in feet,  "  +l+  " height in meters,  "  +d+  " bmi ");
    }
}