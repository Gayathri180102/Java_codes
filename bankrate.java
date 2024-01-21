import java.util.*;

class bank  
{
            int accnum;
            double balance;
            String name;

            Scanner scan = new Scanner(System.in);

            void read() 
            {                      
                System.out.println("Enter the name: ");
                name = scan.nextLine();
                System.out.println("Enter the account number: ");
                accnum = scan.nextInt();
                System.out.println( "Enter the balance:");
                balance = scan.nextDouble();
            }

            void calc() 
            {           
                // balance = balance + (balance * rate) / 100;

            }

            void display() 
            {                   
                System.out.println("Name:" + name);
                System.out.println("Account:"+ accnum);
                System.out.println("Balance:"+ balance);
            }
}
class sbi extends bank
{
    void read()
    {
        super.read();
    }
    void calc()
    {
        int rate = 3;
        balance = balance + (balance * rate) / 100;
    }
    void display()
    {
        super.display();
    }
}

class canra extends bank
{
    void read()
    {
        super.read();
    }
    void calc()
    {
        // super.calc(4);
         int rate = 3;
        balance = balance + (balance * rate) / 100;
    }
    void display()
    {
        super.display();
    }
}
        
class city extends bank
{
    void read()
    {
        super.read();
    }
    void calc()
    {
        // super.calc(3);
         int rate = 3;
        balance = balance + (balance * rate) / 100;
    }
    void display()
    {
        super.display();
    }
}
public class bankrate
{
    public static void main(String[] args)
    {
        sbi s= new sbi();
        s.read();
        s.calc();
        s.display();
        canra c= new canra();
        c.read();
        c.calc();
        c.display();
        city t= new city();
        t.read();
        t.calc();
        t.display();
    }
}