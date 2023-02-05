package Practice;
import java.math.BigDecimal;

public class BigDecimalCal {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000);
        BigDecimal first = BigDecimal.valueOf(1000);

        var result = first.compareTo(principal);
        System.out.println(result);
    }
}
