import java.util.*;
class Student
{
    public static void main(String []args)
    {
        int rollno ;
        String name;
        String school;
        int mobile;
        Scanner std = new Scanner(System.in);
        System.out.println("Enter the Roll no of student :");
        rollno = std.nextInt();

        System.out.println("Roll No of the student is :"  +rollno);
        name = std.nextLine();
        System.out.println("Enter Name of the student :");
        name = std.nextLine();

        System.out.println("Name of the student is :"  +name);

        System.out.println("Enter student school :");
        school = std.nextLine();



        System.out.println("school Name is :"  +school);

        System.out.println("Enter parents mobile number :" );

        mobile =std.nextInt();


        System.out.println("mobile no is: "  +mobile);
        
         System.out.println( name   +mobile   +rollno    +school );
        std.close();

         
    }
}