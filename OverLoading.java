class Calculator{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public double add(double num4, double num5){
        return num4+num5;
    }
}


public class OverLoading{
    public static void main(String a[]){
       int n1 = 4;
       int n2 = 6;
       int n3 = 7;
       int result;
       double result1;
       Calculator obj = new Calculator();
       result = obj.add(n1,n2);
       System.out.println(result);
       result = obj.add(n1,n2,n3);
       System.out.println(result);
       result1 = obj.add(6.8,7.2);
       System.out.println(result1);
    }
}