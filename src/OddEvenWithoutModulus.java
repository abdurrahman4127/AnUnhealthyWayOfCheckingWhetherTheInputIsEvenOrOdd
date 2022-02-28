// note : fractions are neither odd nor even

import java.util.*;

public class OddEvenWithoutModulus {
    public static void main(String[] args)
    {
        while (true) {
            System.out.print("enter a number to check whether it's even or odd : ");

            try {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();

                if(isItEvenOrOdd(n)) {
                    System.out.println(n + " is even \n");
                } else {
                    System.out.println(n + " is odd \n");
                }
            }

            catch (InputMismatchException e) {
                System.out.println("you're supposed to enter an integer number — not character(s) \n");
            }
        }
    }

    private static boolean isItEvenOrOdd(int n) {
        // for positive inputs
        while (n > 2) {
            n -= 2;
        }

        // in case of negative inputs
        while (n < 0) {
            n += 2;
        }

        // as we memorized (in the childhood) that 2 and 0 are even ;)
        if (n == 2 || n == 0) {
            return true;
        }

        return false;
    }
}
