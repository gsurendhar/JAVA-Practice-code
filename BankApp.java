import java.util.*;
public class BankApp{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        BankAcc bank1 = new BankAcc("abc",  "123");
        bank1.showMenu();
    } 
}

class BankAcc{
    int balance;
    int previousTran;
    String custName;
    String custId;
    

    BankAcc(String cName, String cId){
        custName=cName;
        custId = cId;
    }

    void deposite(int amount){
        if (amount!=0){
            balance = balance + amount;
            previousTran = amount;

        }
    }

    void withdraw(int amount){
        if (amount!=0){
            balance = balance - amount;
            previousTran = -amount;

        }
    }

    void getPreviousTran(){
        if(previousTran>0){
            System.out.println("Amount is deposited : " +previousTran);
            
        }
        else if(previousTran<0){
            System.out.println("Amount is withdrawn : " +Math.abs(previousTran));
        }
        else{
            System.out.println("No Transction Occuured");
        }
    }
    void showMenu(){
        char option='\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the : " +custName+ " with having Id: " +custId);
        System.out.println();
        System.out.println("A. for Balance Equairy");
        System.out.println("B. for Deposites");
        System.out.println("C. for Withdrawn");
        System.out.println("D. for Get previous transactions");
        System.out.println("E. Exit from this");

        do{
            // Scanner scan = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println("Please Enter your option");
            System.out.println("-----------------------------");
            option = sc.next().charAt(0);
            option = Character.toUpperCase(option);

            switch(option){
                case 'A':
                    System.out.println("-----------------------------");
                    System.out.println("Balance is : " +balance);
                    System.out.println("-----------------------------");
                    System.out.println();
                    break;
                
                case 'B':
                    System.out.println("-----------------------------");
                    System.out.println("Enter the amount to deposite : ");
                    System.out.println("-----------------------------");
                    int amount = sc.nextInt();
                    deposite(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("-----------------------------");
                    System.out.println("Enter the amount to withdraw : ");
                    System.out.println("-----------------------------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("-----------------------------");
                    getPreviousTran();
                    System.out.println("-----------------------------");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("-----------------------------");
                    System.out.println("you are exited");
                    System.out.println("-----------------------------");
                    break;

                default :
                    System.out.println("-----------------------------");
                    System.out.println("Invalid Option! selected pls try with correct one");
                    System.out.println("-----------------------------");
                    break;

            }

        }while (option!='E');
        sc.close();
    }


}