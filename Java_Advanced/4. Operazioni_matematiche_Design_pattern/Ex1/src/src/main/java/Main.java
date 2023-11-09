//      Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
//      (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum.
//      Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//      Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal val1 = BigDecimal.valueOf(4).setScale(2, RoundingMode.DOWN);


        Expression exp1 = new Expression(BigDecimal.valueOf(8), BigDecimal.valueOf(4), Expression.Operator.SUM);
        OperChooser.operChooser(exp1);

        Expression exp2 = new Expression(BigDecimal.valueOf(8), BigDecimal.valueOf(4), Expression.Operator.SUBTRACTION);
        OperChooser.operChooser(exp2);

        Expression exp3 = new Expression(BigDecimal.valueOf(8), BigDecimal.valueOf(4), Expression.Operator.MULTIPLICATION);
        OperChooser.operChooser(exp3);

        Expression exp4 = new Expression(BigDecimal.valueOf(8), BigDecimal.valueOf(4), Expression.Operator.DIVISION);
        OperChooser.operChooser(exp4);

        Expression exp5 = new Expression(BigDecimal.valueOf(8), BigDecimal.valueOf(4), Expression.Operator.MIN_VALUE);
        OperChooser.operChooser(exp5);

        Expression exp6 = new Expression(BigDecimal.valueOf(8), BigDecimal.valueOf(4), Expression.Operator.MAX_VALUE);
        OperChooser.operChooser(exp6);

    }
}