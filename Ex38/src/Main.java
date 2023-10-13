public class Main {
    public static void main(String[] args) {

        String frase = "Mi chiamo Giuseppe";
        Unicode unicode = new Unicode(frase.toLowerCase(), 3);
        StringBuilder risultato = new StringBuilder(unicode.uniCodeValue());
        System.out.println(risultato);
    }
}