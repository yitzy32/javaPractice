import java.util.Scanner;
import static java.lang.System.out;

public class AreWeThereYet {
  public static void main(String[] args) {
    boolean notThere = true;
    Scanner keyboard = new Scanner(System.in);
    while (notThere) {
      out.print("Are we there yet?");
      String answer = keyboard.next();
      if (answer.equals("y") || answer.equals("Y")) {
        notThere = false;
      }
    }
    keyboard.close();
  }
}
