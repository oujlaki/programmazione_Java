//Classe Account contenente una variabile di istanza name e metodi per assegnare e leggere il suo valore
/*public class Account {
    private String name; //variabile di istanza

    //metodo per assegnare il nome dell'oggetto
    public void setName (String name) {
        this.name = name; //memorizza il nome

    }
    //metodo per recuperare il nome dell'oggetto
    public String getName() {
        return name;
        //restuisce il valore di name al chiamante
    }
}
 */

//classe Account con un costruttore che inizializza il nome.

public class Account {
    private String name; //variabile di istanza

    //il costruttore inizializza name con il nome del parametro
    public Account(String name) { //nome costruttore = nome classe
        this.name = name;

    }

    //metodo per assegnare il nome
    public void setName (String name) {
        this.name = name;
    }
    //metodo per recuperare il nome

    public String getName () {
        return name;

    }
}

