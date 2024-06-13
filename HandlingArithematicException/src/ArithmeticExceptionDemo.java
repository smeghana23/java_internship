import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int dividend, divisor;
        int flag = 0;

        System.out.print("Enter dividend: ");
        dividend = scnr.nextInt();
        
        while(flag == 0){

            System.out.print("Enter divisor: ");
            divisor = scnr.nextInt();

            try {
                int quotient = dividend / divisor;
                flag = 1;
                System.out.println("Quotient: " + quotient);
            } catch (ArithmeticException e) {
            	
            }
        } 
    }
}
