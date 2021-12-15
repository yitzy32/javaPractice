import java.util.Scanner;

public class TrafficLight {

  enum Color { g, y, r }
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Color color;     

    System.out.println("What color is the traffic light? (R/Y/G)");
    String approchingGreenLight = keyboard.next().toLowerCase();
    
    System.out.println("Is it safe to proceed?");
    String safeToProceed = keyboard.next().toLowerCase();
    
    System.out.println("And there are no cops blocking access?");
    String officerBlockingAccess = keyboard.next().toLowerCase();

    if (approchingGreenLight.equals("g") && safeToProceed.equals("y") && officerBlockingAccess.equals("y")) {
      color = Color.g;
      System.out.println("The color of the light is " + color);
      System.out.println("Go");
    } else {
      System.out.println("Stop");
    }
     
    keyboard.close();
  }
}
