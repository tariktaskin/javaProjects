package Numbers;

import java.util.Scanner;

public class PrimeFactorization {
    /*
    Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.


     */
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        int number= scanner.nextInt();

        int i=2;

        System.out.println("these are prime factors of number " + number);
        while (i <= number ){

            if(number%i ==0 && isPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }


    public static boolean isPrime(int a){

        int x=2;
        boolean bool= true;

        while(x< a){

            if(a%x==0){
                bool=false;
                break;
            }
            x++;
        }

        return bool;
    }

}

