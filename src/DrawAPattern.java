import java.util.Scanner;

public class DrawAPattern {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How many dashes would you like to see? ");
    int number = keyboard.nextInt();
    for (int i = 0; i < number; i++) {
      System.out.print("-");
    }
    System.out.println();
    int numberForInner = number;

    for (int i = 0; i < number; i++) {
      for (int j = 1; j < numberForInner; j++) {
        System.out.print("-");
      }
      numberForInner--;
      System.out.println();
    }
    keyboard.close();
  }
}
