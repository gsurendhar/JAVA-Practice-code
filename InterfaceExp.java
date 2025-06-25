@FunctionalInterface
interface Computer {
    
    void code();
    
}

class Desktop implements Computer{
    public void code() {
        System.out.println("code, compile, run , fast");
    }
}

class Laptop implements Computer{
    @Override
    public void code() {
        System.out.println("code, compile, run ");
    }
}


class Developer {
    public void show(Computer lap){
           lap.code();
       
    }
    
}



public class InterfaceExp {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer devApp = new Developer();
        devApp.show(desk);
        devApp.show(lap);
        
    }
}
