import java.util.*;
public class MulTest{
    public static void main (String args[]){
        Scanner mul=new Scanner(System.in);
        System.out.print("Enter the value :  ");
        int m=mul.nextInt();
        int j;
        int p;
        mul.close();
        
        for(j=1;j<=20;j++){
            p=m*j;
            System.out.println(m+"*"+j+"="+p);
        }
    }
}