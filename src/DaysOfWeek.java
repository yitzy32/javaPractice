import java.util.Scanner;
public class DaysOfWeek {
  public static void main(String[] args) {
    System.out.println("Enter a number and I will tell you the corresponding day of the week!");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();

    switch (number) {
      case 1:
        System.out.println("Zuntig");
        break;
      case 2:
        System.out.println("Muntig");
        break;
      case 3:
        System.out.println("Dinstig");
        break;
      case 4:
        System.out.println("Mitvoch");
        break;
      case 5:
        System.out.println("Donoshtig");
        break;
      case 6:
        System.out.println("Frietig");
        break;
      case 7:
        System.out.println("שבת קודש");
        break;
    }

    keyboard.close();
  }
}
