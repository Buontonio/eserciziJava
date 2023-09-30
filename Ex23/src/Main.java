//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
//la stampa dovrà saltare il valore uguale a 5.

// ANCORA UNA VOLTA MI SONO COMPLICATO LA VITA DA SOLO!

// 1st way (parametrizzato a voler saltare l'intero in 5a posizione positiva rispetto all'intero di partenza (all'interno di un range
// compreso tra l'intero di partenza e 10 interi positivi oltre)

        public class Main {
            public static void main(String[] args) {

                for (int i = 0; i <= 10; i++) {
                    if (i == 5) {
                        continue;
                    }
                    System.out.println(i);
                }
            }
        }

//// 2nd way (parametrizzato a voler saltare l'intero in 5a posizione positiva rispetto all'intero di partenza (all'interno di un range
//// compreso tra l'intero di partenza e 10 interi positivi oltre)
//
//        public class Main {
//            public static void main(String[] args) {
//                int x = 3;
//                intJumper(x);
//            }
//                public static void intJumper(int x){
//                    for (int i = x; i <= x+10; i++) {
//                        if (i == x + 5) {
//                            continue;
//                        }
//                        System.out.println(i);
//                    }
//                        System.out.print("Mi dovevano chiamare Tommaso, perché se non vedo non credo :)");
//                }
//
//            }