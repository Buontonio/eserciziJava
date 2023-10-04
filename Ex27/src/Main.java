//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita con dei valori
// a vostro piacimento
// e restituisca la somma degli elementi sulla prima riga
public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[0][j];
            System.out.println(matrix[0][j]);

        }
        System.out.print(sum + " ");
    }
}