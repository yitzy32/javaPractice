import java.util.Scanner;

public class SeeingStars {
  public static void main(String[] args) {
    boolean userWantsOutput = true;
    Scanner keyboard = new Scanner(System.in);
    while (userWantsOutput) {
      System.out.print("Do you want a row of stars? (y/n) ");
      String yesOrNo = keyboard.next();

      if (yesOrNo.toLowerCase().equals("n")) break;

      System.out.print("How many stars? ");
      int howMany = keyboard.nextInt();
      for (int i = 0; i < howMany; i++) {
        System.out.print("*");
      }
      System.out.println();
      userWantsOutput = false;
    }
    keyboard.close();
  }
}
