public class AddedOOPs{
    public static void main(String args[]){
        int n1 = 5;
        int n2 = 6;
        Calcu cal = new Calcu();
       int result = cal.add(n1,n2);
        System.out.println("addition of numbers is : "  +result);

    }
}

class Calcu{
    public int add(int num1,int num2){
        
        int r;
        r = num1 + num2;
        return r;
    }
}