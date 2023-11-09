import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypeOfOperation {

    public static BigDecimal sumOfBig(BigDecimal value1, BigDecimal value2) {
        System.out.println("Between the values: " + value1 + ", and: " + value2);
        BigDecimal total = value1.setScale(2, RoundingMode.HALF_DOWN).add(value2.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println("This is the result of the operation: " + total);
        return total;
    }

    public static BigDecimal subtractionOfBig(BigDecimal value1, BigDecimal value2) {
        System.out.println("Between the values: " + value1 + ", and: " + value2);
        BigDecimal total = value1.setScale(2, RoundingMode.HALF_DOWN).subtract(value2.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println("This is the result of the operation: " + total);
        return total;
    }

    public static BigDecimal multplicationOfBig(BigDecimal value1, BigDecimal value2) {
        System.out.println("Between the values: " + value1 + ", and: " + value2);
        BigDecimal total = value1.multiply(value2.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println("This is the result of the operation: " + total);
        return total;
    }

    public static BigDecimal divisionOfBig(BigDecimal value1, BigDecimal value2) {
        if (value1.compareTo(value2) > 0) {
            System.out.println("Between the values: " + value1 + ", and: " + value2);
            BigDecimal total = value1.setScale(2, RoundingMode.CEILING).divide(value2.setScale(2, RoundingMode.CEILING));
            System.out.println("This is the result of the operation: " + total);
        } else System.out.println("The result can't be shown");
        return null;
    }

    public static BigDecimal minOfBig(BigDecimal value1, BigDecimal value2) {
        if (value1.compareTo(value2) < 0) {
            System.out.println("Between the values: " + value1 + ", and: " + value2);
            BigDecimal minValue1 = value1.setScale(2, RoundingMode.HALF_DOWN);
            System.out.println(minValue1 + " is the smaller value.");
            return minValue1;
        }
        System.out.println("Between the values: " + value1 + ", and: " + value2);
        BigDecimal minValue2 = value2.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(minValue2 + " is the smaller value.");
        return minValue2;
    }

    public static BigDecimal maxOfBig(BigDecimal value1, BigDecimal value2) {
        if (value1.compareTo(value2) > 0) {
            System.out.println("Between the values: " + value1 + ", and: " + value2);
            BigDecimal maxValue1 = value1.setScale(2, RoundingMode.HALF_DOWN);
            System.out.println(maxValue1 + " is the bigger value.");
            return maxValue1;
        }
        System.out.println("Between the values: " + value1 + ", and: " + value2);
        BigDecimal maxValue2 = value2.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(maxValue2 + " is the bigger value.");
        return maxValue2;
    }
}
