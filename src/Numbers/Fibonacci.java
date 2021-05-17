package Numbers;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number bigger than 2");
        int input= scanner.nextInt();

        int a= 0;
        int b= 1;

        int c= a + b;


        System.out.print(0 +" " + 1 + " ");
        for (int i = 0; i < input-2; i++) {

            System.out.print(c);
            System.out.print(" ");

            a=b;
            b=c;
            c= a+b;

        }
    }
}
