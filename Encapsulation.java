class human {
    private int age;
    private String name ;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

class humanG {
    private int age;
    private String name ;
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        human obj = new human();
        obj.setAge(26);
        obj.setName("Surendhar");

        System.out.println(obj.getAge()+ " : " +obj.getName());


        humanG obj1 = new humanG();
        obj1.setAge(16);
        obj1.setName("Navin");

        System.out.println(obj1.getAge()+ " : " +obj1.getName());
        
        
    }
}
