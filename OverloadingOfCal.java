class Calc 
{
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }

    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public double add(double n1, double n2, double n3)
    {
        return n1+n2+n3;
    }

    public double add(double n1, double n2)
    {
        return n1+n2;
    }

}





public class OverloadingOfCal 
{
    public static void main(String args[])
    {
        Calc cal = new Calc();
        int r1 = cal.add(3, 4,6);
        int r2 = cal.add(3, 4);
        double r3 = cal.add(3.9, 4.5, 10.5);
        double r4 = cal.add(3, 4);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}
