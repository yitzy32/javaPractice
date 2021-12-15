import java.util.Scanner;

class AgeCheck {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int age, dimensions;
        double price = 0.00;
        char reply;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("Have a coupon? (Y/N) ");
        reply = keyboard.findWithinHorizon(".", 0).charAt(0);

        System.out.print("How many dimensions? 2 or 3 ?");
        dimensions = keyboard.nextInt();

        if (age >= 12 && age < 65) {
            price = 9.25;
            if (reply == 'Y' || reply == 'y') {
                price -= 2.00;
            }
        } else {
            price = 5.25;
        }

        if (dimensions == 3) {
          price += 3.00;
        }
        
        System.out.print("Please pay $ " + price + ". Enjoy the show!");
        
        keyboard.close();
    }
}
