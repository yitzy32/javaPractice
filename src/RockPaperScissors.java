 public class RockPaperScissors {
  
  enum Choice {
    rock, paper, scissors
  }

  public static void main(String[] args) {
    for (Choice playerOne : Choice.values()) {
      for (Choice playerTwo : Choice.values()) {
        System.out.println(playerOne + " " + playerTwo);
      }
      
    }
  }
}

/*
* Outputs all possible outcomes:

* rock rock
* rock paper
* rock scissors
* paper rock
* paper paper
* paper scissors
* scissors rock
* scissors paper
* scissors scissors 
*/