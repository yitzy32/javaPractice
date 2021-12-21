class Purchase {
  double unitPrice;
  int quantity;
  boolean taxable;

  double getTotal() {
    double total = unitPrice * quantity;
      if (taxable) {
          total *= 1.05;
      }
    return total;
  }
}
