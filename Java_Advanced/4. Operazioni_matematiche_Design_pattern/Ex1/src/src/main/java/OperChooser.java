import java.math.BigDecimal;

public class OperChooser {

    public static BigDecimal operChooser(Expression exp) {

        switch (exp.getOperator()) {
            case SUM:
                System.out.println("The selected operation is: " + exp.getOperator());
                TypeOfOperation.sumOfBig(exp.getValue1(), exp.getValue2());
                break;
            case SUBTRACTION:
                System.out.println("The selected operation is: " + exp.getOperator());
                TypeOfOperation.subtractionOfBig(exp.getValue1(), exp.getValue2());
                break;
            case MULTIPLICATION:
                System.out.println("The selected operation is: " + exp.getOperator());
                TypeOfOperation.multplicationOfBig(exp.getValue1(), exp.getValue2());
                break;
            case DIVISION:
                System.out.println("The selected operation is: " + exp.getOperator());
                TypeOfOperation.divisionOfBig(exp.getValue1(), exp.getValue2());
                break;
            case MIN_VALUE:
                System.out.println("The selected operation is: " + exp.getOperator());
                TypeOfOperation.minOfBig(exp.getValue1(), exp.getValue2());
                break;
            case MAX_VALUE:
                System.out.println("The selected operation is: " + exp.getOperator());
                TypeOfOperation.maxOfBig(exp.getValue1(), exp.getValue2());
                break;
        }
        return null;
    }
}
