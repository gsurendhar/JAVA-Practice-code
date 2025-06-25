// @FunctionalInterface
// public interface Computer {
    
//     void code();
    
// }

// class Desktop implements Computer{
//     public void code(Computer desk){
//         System.out.println("code, compile, run , fast");
//     }
// }

// class Laptop implements Computer{
//     public void code(Computer lap){
//         System.out.println("code, compile, run ");
//     }
// }


// class Developer {
//     public void show(Computer lap){
//            lap.code();
       
//     }
    
// }



// public class InterfaceExp {
//     public static void main(String[] args) {
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
//         Developer devApp = new Developer();
//         devApp.show(lap);
        
//     }
// }






interface Computer
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
		navin.devApp(desk);
        
    }
}