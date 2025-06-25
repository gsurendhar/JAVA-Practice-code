class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+ "  : " +price+ " : "+ name);                      // non statsi method

    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand+ "  : " +obj.price+ " : "+ name);              //static method

    }
}






public class StaticMethod {
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
        

        obj.show();             // non static method
        obj1.show();
        obj2.show();
        Mobile.show1(obj);          // static method
        Mobile.show1(obj1);
        Mobile.show1(obj2);
        
    }
    
}
