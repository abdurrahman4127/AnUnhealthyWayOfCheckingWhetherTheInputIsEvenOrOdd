import java.util.Scanner;

public class OddEvenUsingIntegerDivision {
    public static void main(String[] args)
    {
        while (true) {
            System.out.print("enter a number to check whether it's even or odd : ");
            
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            
            int temp = n / 2;  // storing the result of integer division 

            if(temp*2 == n) {
                System.out.println(n + " is even \n");
            }
            else {
                System.out.println(n + " is odd \n");
            }
        }
    }
}

/*          how it works : it happens because of integer division

     in case of even inputs :
        n = 8; temp = 8/2 = 4; and temp*2 = 4*2 = 8 — which is equal to
        the input i.e. n = temp*2 or 8 = 8

     in case of odd inputs :
        n = 9; temp = 9/2 = 4 (not 4.5); and temp*2 = 4*2 = 8 — which is NOT equal
        to the input i.e. 9 != 8.
 */
