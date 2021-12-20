public class DisplaySomeOfTheElements {
  public static void main(String[] args) {
    int amounts[] = {
      19, 21, 16, 14, 99, 86, 31, 19, 0, 101
    };

    for (int i = 0; i < amounts.length; i++) {
      if (i % 2 == 0) {
        System.out.println(amounts[i]);
      }
    }
  }
}
