import java.util.Scanner;
import java.io.File; // for both reading/writing
import java.io.FileNotFoundException; // for both reading/writing
import java.io.PrintStream; // just for writting

public class ReadAndWriteData {
  public static void main(String[] args) throws FileNotFoundException {
    // for both reading/writing^^
    Scanner diskScanner = new Scanner(new File("dataToRead.txt"));

    PrintStream diskWriter = new PrintStream("dataToWrite.txt");

    // ----- = diskScanner.nextInt();
    // ----- = diskScanner.nextDouble();
    String message = diskScanner.nextLine();
    // ----- = diskScanner.findWithinHorizon(".", 0).charAt(0);
    
    System.out.println(message);
    
    diskWriter.print(message.toUpperCase());

    diskWriter.close();
    diskScanner.close();
  }
}
