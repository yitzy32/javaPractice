import java.util.Scanner;
public class SmileyFace {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Would you like to see a smileyface?(y/n)");
    String answer = keyboard.next();
    if (answer.equals("y")) {
      System.out.println(":-)");
    } else if (answer.equals("n")) {
      System.out.println(":-(");
    } else {
      System.out.println("invalid answer");
    }
    keyboard.close();
  }
}
