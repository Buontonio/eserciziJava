//        Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//        All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//        Creare 2 oggetti User di cui creerà un'istanza.
//        Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video

package org.example;

public class Main {

    public static void main(String[] args) {


        User u1 = User.getUser();
        User u2 = User.getUser();

        System.out.println("First user info: ");
        u1.printInfo();

        u2.setName("Marco");
        u2.setAge(36);

        System.out.println("Second user info: ");
        u2.printInfo();

    }
}