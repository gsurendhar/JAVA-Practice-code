class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+ "  : " +price+ " : "+ name);
    }
}





public class StaticKey {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "apple";
        obj.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "nokia";
        obj2.price = 1100;
        Mobile.name = "SmartPhone";
        

        obj.show();
        obj1.show();
        obj2.show();
    }
}
