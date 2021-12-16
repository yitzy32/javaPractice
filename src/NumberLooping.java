import static java.lang.System.out;
import java.util.Scanner;

public class NumberLooping {
  public static void main(String[] args) {
    boolean numberIsTooSmall = true;
    Scanner keyboard = new Scanner(System.in);
    while (numberIsTooSmall) {
      out.println("Please enter a number");
      int number = keyboard.nextInt();
      if (number > 100) {
        numberIsTooSmall = false;
      }
    }
    keyboard.close();
  }
}
