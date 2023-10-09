public class Studente {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    private int id;

    public Studente(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public int getId() {
        return id;


    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
