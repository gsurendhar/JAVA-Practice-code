import java.util.*;

class Add
{
    public static void main(String []args)  
        {
            int a ;
            int b ;
            int c ;

        Scanner scn = new Scanner(System.in);

            System.out.println("Entered Value of a:");
             a = scn.nextInt();

      
            System.out.println("Entered Value of b:");
             b = scn.nextInt();

      
            c=a+b;
            System.out.println(" result = " +c );
            scn.close();
            
        }


}