//Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Studente.
public class Main {
    public static void main(String[] args) {

        Studente student1 = new Studente("Antonio", "Buonanno", 1);

        System.out.println(student1);
    }
}