
public class Converter {

    private static final double EXCHANE_RATE_OF_DOLLAR_EURO = 1.35;

    public static Euro convertDollarToEuro(Dollar dollar) {
        return new Euro(dollar.getValue() / EXCHANE_RATE_OF_DOLLAR_EURO);
    }
}
