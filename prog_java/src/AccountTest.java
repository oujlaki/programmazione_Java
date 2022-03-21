//Creazione e manipolazione di un oggetto Account

import java.util.Scanner;
//utilizzo del costruttore  Account per inizializzare la variabile di istanza name
// al momento della creazione di ciascun oggetto Account.

public class AccountTest {
    public static void main (String [] args) {
        //crea due oggetti Account
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        //visualizza il valore iniziale per ciascun account
        System.out.printf("account1 name is: %s%n" , account1.getName());
        System.out.printf("account2 name is: %s%n" , account2.getName());
    }










    }
/*public class AccountTest {
    public static void main (String [] args) {
        //crea un oggetto Scanner per l'input della finestra dei comandi
        Scanner input = new Scanner(System.in);

        //crea un oggetto Account e lo assegna a myAccount
        Account myAccount = new Account();

        //visualizza il valore iniziale di name (null)
        System.out.printf("Initial name is: %s%n%n ", myAccount.getName());

        //chiede e legge il nome
        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); //legge una riga di testo
        myAccount.setName(theName); //pone theName in myAccount
        System.out.println();

        //visualizza il nome memorizzato nell'oggetto myAccount
        System.out.printf("Name in object myAccount is: %n%s%n",  myAccount.getName());




    }


}*/
