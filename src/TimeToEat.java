import java.util.Scanner;
public class TimeToEat {
  public static void main(String[] args) {
    System.out.println("What hour of the day is it? ");

    Scanner keyboard = new Scanner(System.in);
    String hour = keyboard.nextLine();

    switch (hour.toLowerCase()) {
      case "6 am":
      case "7 am":
      case "8 am":
      case "9 am":
        System.out.println("Breakfast is served");
        break;
      case "11 am":
      case "12 am":
      case "1 pm":
        System.out.println("Time for lunch");
        break;
      case "5 pm":
      case "6 pm":
      case "7 pm":
      case "8 pm":
        System.out.println("Time for supper");
        break;
      default:
        System.out.println("Not mealtime... Get a snack");
        break;
    }
    
    keyboard.close();
  }
}
