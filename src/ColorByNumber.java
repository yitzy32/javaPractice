import java.util.Scanner;
public class ColorByNumber {
  public static void main(String[] args) {
    System.out.println("Enter a number and I'll tell you a color");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();

    switch (number) {
      case 0:
        System.out.println("Black");
        break;
      case 1:
        System.out.println("Blue");
        break;
      case 2:
        System.out.println("Green");
        break;
      case 3:
        System.out.println("Cyan");
        break;
      case 4:
        System.out.println("Red");
        break;
      case 5:
        System.out.println("Magenta");
        break;
      case 6:
        System.out.println("Yellow");
        break;
      case 7:
        System.out.println("White");
        break;
    }
    keyboard.close();
  }
}
