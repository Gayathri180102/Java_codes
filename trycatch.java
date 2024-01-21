import java.util.*;
public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Enter the first number");
        n1 = sc.nextInt();
        System.out.println("Enter the second number");
        n2 = sc.nextInt();

        try {
            if (n1 > 0 && n2 > 0) {
                System.out.println("Both numbers are positive");
            } else if (n1 < 0 || n2 < 0) {
                throw new InputMismatchException("Enter positive number");
            }
            if (n2 == 0) {
                throw new ArithmeticException("Division by zero not allowed");
            }

            double result = (double) n1 / n2;
            System.out.println("Result is " + result);

        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Please enter a positive number");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e.getMessage());
        } 
        finally 
        {
            sc.close();
        }
    }
}