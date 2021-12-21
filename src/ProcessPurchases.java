class ProcessPurchases {

  public static void main(String[] args) {
      Purchase purchase1 = new Purchase();
      purchase1.unitPrice = 20.00;
      purchase1.quantity = 3;
      purchase1.taxable = true;

      Purchase purchase2 = new Purchase();
      purchase2.unitPrice = 20.00;
      purchase2.quantity = 3;
      purchase2.taxable = false;

      double purchase1Total = purchase1.unitPrice * purchase1.quantity;
      if (purchase1.taxable) {
          purchase1Total *= 1.05;
      }

      double purchase2Total = purchase2.unitPrice * purchase2.quantity;
      if (purchase2.taxable) {
          purchase2Total *= 1.05;
      }

      if (purchase1Total == purchase2Total) {
          System.out.println("No difference");
      } else {
          System.out.println("These purchases have different totals.");
      }
  }
}
