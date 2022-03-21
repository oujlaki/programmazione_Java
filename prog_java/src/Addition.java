//Programma per le addizioni che mostra la somma di due numeri

import java.util.Scanner; // classe scanner

public class Addition {
    //il metodo main inizia l'esecuzione dell'applicazione Java
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum is  " + sum);

    }
}
