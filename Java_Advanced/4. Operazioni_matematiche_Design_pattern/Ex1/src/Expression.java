import java.math.BigDecimal;

public class Expression {

    enum Operator {
        SUM,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        MIN_VALUE,
        MAX_VALUE
    }

    private BigDecimal value1;
    private BigDecimal value2;
    private Operator operator;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public Expression(BigDecimal value1, BigDecimal value2, Operator operator) {
        this.value1 = value1;
        this.value2 = value2;
        this.operator = operator;
    }
}
