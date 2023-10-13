public class Unicode {

    public String frase;
    public int posizione;

    public Unicode(String frase, int posizione) {
        this.frase = frase;
        this.posizione = posizione;
    }

    public String uniCodeValue() {
        if (posizione >= 0 && posizione <= frase.length()) {
            int z = frase.charAt(posizione);
            StringBuilder costruttore = new StringBuilder();
            costruttore.append("Il valore della lettere in posizione: ");
            costruttore.append(posizione);
            costruttore.append(" è: ");
            costruttore.append(z);
            return costruttore.toString();
        }  else {
            return "Errore";
        }
    }
}
