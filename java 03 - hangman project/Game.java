class Game {
  //  Declare variables
  public static final int MAX_MISSES = 7;
  private String answer;
  private String hits;
  private String misses;

  //  Constructor for Game objects
  public Game(String answer) {
    this.answer = answer;
    hits = "";
    misses = "";
  }

  //  method to determine if guess is in answer, and assign to hits or misses
  public boolean applyGuess(char letter) {
    if (hits.indexOf(letter) != -1 || misses.indexOf(letter) != -1) {
      throw new IllegalArgumentException(letter + " has already been guessed");
    }
    boolean isHit = answer.indexOf(letter) != -1;
    if (isHit) {
      hits += letter;
    } else {
      misses += letter;
    }
    return isHit;
  }

  //  Method to get number of remaining tries
  public int getRemainingTries() {
    return MAX_MISSES - misses.length();
  }

  //
  public String getCurrentProgress() {
    String progress = "";
    for (char letter : answer.toCharArray()) {
      char display = '-';
      if (hits.indexOf(letter) != -1) {
        display = letter;
      }
      progress += display;
    }
    return progress;
  }

}
