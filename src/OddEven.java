import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
    {
        while (true) {
            System.out.print("enter a number to check if its even or odd : ");

            try{
                Scanner scanner = new Scanner(System.in);
                double n = scanner.nextInt();

                if(isItEvenOrOdd(n) == true) {
                    System.out.println(n + " is even \n");
                }

                else if(isItEvenOrOdd(n) == false) {
                    System.out.println(n + " is odd \n");
                }
            }

            catch (InputMismatchException e){
                System.out.println("you're supposed to enter a number — not character(s) \n");
            }
        }
    }

    private static boolean isItEvenOrOdd(double n) {
        // for positive inputs
        while (n > 2){
            n = n - 2;
        }

        // in case of negative inputs
        while (n < 0){
            n = n + 2;
        }

        // as we memorized (in the childhood) that 2 and 0 are even
        if (n == 2 || n == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

