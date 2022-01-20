public class StringMethodPractice {
  public static void main(String[] args) {
    String string = "my string here";

    // .contains
    CharSequence cs = "my";
    System.out.println(string.contains(cs));

    // .equalsIgnoreCase
    String upcase = "MY STRING HERE";
    System.out.println(string.equalsIgnoreCase(upcase));

    int number = string.hashCode();
    System.out.println(number);

    // .replace
    System.out.println(string.replace(' ', '-'));
    
    // .toCharArray()
    char[] stringArray = string.toCharArray();
    for (int i = 0; i < stringArray.length; i++) {
      System.out.println(stringArray[i]);
    }

    // .toLowerCase()
    System.out.print(upcase);
    System.out.print(" to: ");
    System.out.println(upcase.toLowerCase());

    // .trim()
    String extraWhitespace = "   my string here  ";
    System.out.println(extraWhitespace.trim());

    
  }
}
