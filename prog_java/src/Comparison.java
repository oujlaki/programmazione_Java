//Confronta due interi usando costrutti if, operatori relazionali e di ugualianza

import java.util.Scanner;

public class Comparison {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("enter second integer: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }


    }




}
