public class CurrencyConversionTable {
  public static void main(String[] args) {
    System.out.println("Pounds     Dollars");
    double pounds = 1.25;
    for (int i = 1; i < 11; i++) {
      System.out.println("  " + i + "         " + pounds);
      pounds = i * 1.25;
    }
  }
}
