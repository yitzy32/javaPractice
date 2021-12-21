class ProcessPurchases {

  public static void main(String[] args) {
      Purchase purchase1 = new Purchase();
      purchase1.unitPrice = 20.00;
      purchase1.quantity = 3;
      purchase1.taxable = true;

      double total1 = purchase1.getTotal();
      System.out.println(total1);
      
      Purchase purchase2 = new Purchase();
      purchase2.unitPrice = 80.00;
      purchase2.quantity = 3;
      purchase2.taxable = false;
      
      double total2 = purchase2.getTotal();
      System.out.println(total2);
  }
}
