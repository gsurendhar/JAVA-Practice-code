@FunctionalInterface
interface Computer {
    
    void code();
    
}

class Desktop{
    public void code(Computer desk){
        System.out.println("code, compile, run , fast");
    }
}

class Laptop{
    public void code(Computer lap){
        System.out.println("code, compile, run ");
    }
}


class Developer{
    public void Suri(Computer lap){
        lap.code();
    }
    
}



public class InterfaceExp1 {
    public static void main(String[] args) {
        
        
    }
}
