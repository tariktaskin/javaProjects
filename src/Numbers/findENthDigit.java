package Numbers;

import java.math.BigDecimal;
import java.util.Scanner;

public class findENthDigit {

    public static void main(String[] args) {

        /*

        Find e to the Nth Digit - Just like the previous problem, but with e instead of PI. Enter a number and have the program generate e up to that many decimal places. Keep a limit to how far the program will go.
         */

        double mathe= Math.E;

        Scanner input= new Scanner(System.in);
        System.out.println("enter number of decimal");

        int i= input.nextInt();

        BigDecimal printThis= new BigDecimal(mathe).divide(BigDecimal.valueOf(1),i, BigDecimal.ROUND_UP);

        System.out.println(printThis);




    }

}
