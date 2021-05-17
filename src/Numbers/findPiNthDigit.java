package Numbers;

import java.math.BigDecimal;
import java.util.Scanner;

public class findPiNthDigit {
    /*
    Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places. Keep a limit to how far the program will go.
     */

    public static void main(String[] args) {

        BigDecimal bd= new BigDecimal( 7.0);
        Scanner scanner= new Scanner(System.in);
        System.out.println("now enter number of decimal");

        int a= scanner.nextInt();

        BigDecimal pi= new BigDecimal(22.0).divide(bd,a,BigDecimal.ROUND_UP);

        System.out.println(pi);

    }


}
