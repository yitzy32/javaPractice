import java.util.Scanner;
import static java.lang.System.out;

public class AddNumbersLoop {
  public static void main(String[] args) {
    boolean inputIsPositive = true;
    int sum = 0;
    Scanner keyboard = new Scanner(System.in);
    while (inputIsPositive) {
      out.println("Please enter a number");
      int input = keyboard.nextInt();
      
      if (input < 0) {
        inputIsPositive = false;
      } else if (input > 0) {
        sum += input;
      }
    }
    keyboard.close();
    out.println(sum);
  }
}
