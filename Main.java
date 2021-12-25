import java.util.Scanner;

class Main {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";

  public static void printing(String[][] levelOneMap, int gemsColected, int totalGems, int level) {

    for (int i = 0; i < levelOneMap[0].length + 2; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }
    System.out.println();

    for (int i = 0; i < 3; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }

    System.out.print(ANSI_RESET + "| Level " + level + " |");

    for (int i = 0; i < 5; i++) {
      System.out.print(ANSI_BLUE + "▓");
    }

    // ---------

    System.out.println();

    for (int i = 0; i < levelOneMap[0].length + 2; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }
    System.out.println();

    if (levelOneMap.length < 2) {
      System.out.print(ANSI_BLUE + "▓▓");

      for (int i = 0; i < levelOneMap[0].length; i++) {

        System.out.print(levelOneMap[0][i]);

      }
          System.out.print(ANSI_BLUE + "▓▓");

    } else {

      
      for (int i = 0; i < levelOneMap.length; i++) {
                System.out.print(ANSI_BLUE + "▓▓");
        for (int j = 0; j < levelOneMap[0].length; j++) {

          System.out.print(levelOneMap[i][j]);

        }
         System.out.print(ANSI_BLUE + "▓▓");

        if(!(i == levelOneMap.length - 1)){
        System.out.println();
        }
      }
    }
    System.out.println();

    for (int i = 0; i < levelOneMap[0].length + 2; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }

    System.out.println("\n\n       " + ANSI_GREEN + "██ " + ANSI_RESET + totalGems + " - " + gemsColected);

    System.out.println();

  }

  public static String[][] levelOneMapGeneration() {

    String[][] levelOneMap = new String[1][9];

    for (int i = 0; i < levelOneMap[0].length; i++) {

      levelOneMap[0][i] = ANSI_BLUE + "██";
    }
    levelOneMap[0][0] = ANSI_RESET + "██";
    levelOneMap[0][8] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelTwoMapGeneration() {

    String[][] levelOneMap = new String[3][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    for(int i = 0; i < levelOneMap[0].length - 1; i++){

      levelOneMap[1][i] = ANSI_BLACK + "▓▓";

    }

    levelOneMap[2][0] = ANSI_RESET + "██";
    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelThreeMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }
  }
    public static String[][] levelFourMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[4][0] = ANSI_RESET + "██";

    levelOneMap[4][3] = ANSI_BLUE + "▓▓";
    levelOneMap[4][4] = ANSI_BLUE + "▓▓";
    levelOneMap[3][3] = ANSI_BLUE + "▓▓";
    levelOneMap[3][4] = ANSI_BLUE + "▓▓";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
  
    levelOneMap[0][4] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static void playLevel(String[][] levelOneMap, int playerXPosition, int playerYPosition, int totalGems,
      int level) {

    Scanner scan = new Scanner(System.in);
    int gemCount = 0;

    printing(levelOneMap, gemCount, totalGems, level);

    while (true) {
      String movment = scan.nextLine();

      if(movment.equals("r")){
          if(level == 1){
            levelOneMap = levelOneMapGeneration();
            playerXPosition = 0;
            playerYPosition = 0;
          }
          if(level == 2){
            levelOneMap = levelTwoMapGeneration();
            playerXPosition = 0;
            playerYPosition = 2;
            
          }
          if(level == 3){
            levelOneMap = levelThreeMapGeneration();
            playerXPosition = 3;
            playerYPosition = 4;
          }
          gemCount = 0;
             System.out.println("\033[H\033[2J");
             printing(levelOneMap, gemCount, totalGems, level);

        }

      if (playerXPosition < levelOneMap[0].length - 1) {
        if (movment.equals("d") && levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_BLUE + "██")) {

          while (playerXPosition < levelOneMap[0].length - 1) {
            if (levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_BLUE + "██")) {
              System.out.println("\033[H\033[2J");
              playerXPosition++;
              levelOneMap[playerYPosition][playerXPosition] = ANSI_RESET + "██";
              levelOneMap[playerYPosition][playerXPosition - 1] = ANSI_BLUE + "██";
              printing(levelOneMap, gemCount, totalGems, level);
              try {
                Thread.sleep(50);
              } catch (Exception e) {
              }

            }

            else {
              break;
            }

          }

        }
      }

      if (playerXPosition > 0) {
        if (movment.equals("a") && levelOneMap[playerYPosition][playerXPosition - 1].equals(ANSI_BLUE + "██")) {

          while (playerXPosition > 0) {

            if (levelOneMap[playerYPosition][playerXPosition - 1].equals(ANSI_BLUE + "██")) {
              System.out.println("\033[H\033[2J");
              playerXPosition--;
              levelOneMap[playerYPosition][playerXPosition] = ANSI_RESET + "██";
              levelOneMap[playerYPosition][playerXPosition + 1] = ANSI_BLUE + "██";
              printing(levelOneMap, gemCount, totalGems, level);
              try {
                Thread.sleep(50);
              }

              catch (Exception e) {
              }
            } else {
              break;
            }
          }

        }
      }

      if (playerYPosition > 0) {
        if (movment.equals("w") && levelOneMap[playerYPosition - 1][playerXPosition].equals(ANSI_BLUE + "██")) {

          while (playerYPosition > 0) {

            if (levelOneMap[playerYPosition - 1][playerXPosition].equals(ANSI_BLUE + "██")) {
              System.out.println("\033[H\033[2J");
              playerYPosition--;
              levelOneMap[playerYPosition][playerXPosition] = ANSI_RESET + "██";
              levelOneMap[playerYPosition + 1][playerXPosition] = ANSI_BLUE + "██";
              printing(levelOneMap, gemCount, totalGems, level);
              try {
                Thread.sleep(50);
              }

              catch (Exception e) {
              }
            } else {
              break;
            }
          }

        }
      }
      if (playerYPosition < levelOneMap.length - 1) {
        if (movment.equals("s") && levelOneMap[playerYPosition + 1][playerXPosition].equals(ANSI_BLUE + "██")) {

          while (playerYPosition < levelOneMap.length - 1) {

            if (levelOneMap[playerYPosition + 1][playerXPosition].equals(ANSI_BLUE + "██")) {
              System.out.println("\033[H\033[2J");
              playerYPosition++;
              levelOneMap[playerYPosition][playerXPosition] = ANSI_RESET + "██";
              levelOneMap[playerYPosition - 1][playerXPosition] = ANSI_BLUE + "██";
              printing(levelOneMap, gemCount, totalGems, level);
              try {
                Thread.sleep(50);
              }

              catch (Exception e) {
              }
            } else {
              break;
            }
          }

        }
      }

      if (playerXPosition > 0 && playerXPosition < levelOneMap[0].length - 1) {

        if (movment.equals("d")) {

          if (levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_GREEN + "██")) {
            System.out.println("\033[H\033[2J");
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition][playerXPosition + 1] = ANSI_RESET + "██";
            gemCount++;
            playerXPosition++;
            printing(levelOneMap, gemCount, totalGems, level);
          }

        }
        if (movment.equals("a")) {

          if (levelOneMap[playerYPosition][playerXPosition - 1].equals(ANSI_GREEN + "██")) {
            System.out.println("\033[H\033[2J");
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition][playerXPosition - 1] = ANSI_RESET + "██";
            gemCount++;
            playerXPosition--;
            printing(levelOneMap, gemCount, totalGems, level);
          }

        }

      }
      if (playerYPosition > 0 && playerYPosition < levelOneMap.length - 1) {
        if (movment.equals("w")) {

          if (levelOneMap[playerYPosition - 1][playerXPosition].equals(ANSI_GREEN + "██")) {
            System.out.println("\033[H\033[2J");
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition - 1][playerXPosition] = ANSI_RESET + "██";
            gemCount++;
            playerYPosition--;
            printing(levelOneMap, gemCount, totalGems, level);
          }

        }

        if (movment.equals("s")) {

          if (levelOneMap[playerYPosition + 1][playerXPosition].equals(ANSI_GREEN + "██")) {
            System.out.println("\033[H\033[2J");
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition + 1][playerXPosition] = ANSI_RESET + "██";
            gemCount++;
            playerYPosition++;
            printing(levelOneMap, gemCount, totalGems, level);
          }

        }

        

      }

      

      if (gemCount == totalGems) {
        break;
      }

    }
    System.out.print("All Gems Have Been Collected!\nPress [ENTER] to go to the next level.");
    String nextLevel = scan.nextLine();

  }

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    // String[][] levelOneMap = new String[10][15];
System.out.println("    __________________________________________________________________");
System.out.println("      __                             __                           ");
System.out.println("    /    )   ,       /             /    )          ,              ");
System.out.println("----\\------------__-/----__--------\\---------------------__----__-");
System.out.println("     \\     /   /   /   /___)        \\    | /| /  /     /   ) /___)");
System.out.println("_(____/___/___(___/___(___ _____(____/___|/_|/__/_____/___/_(___ _");
System.out.println("                                                     /            ");
System.out.println("                                                    ");

System.out.println("Welcome to Side Swipe!");
System.out.println("\nPress [ENTER] To Start.");
Scanner scan = new Scanner(System.in);
String word = scan.nextLine();
    System.out.println("\033[H\033[2J");
System.out.println("In this game In this game you can use the W,A,S,D keys to choose where you want to move and the key [R] to reset the map. (but renember to click [ENTER] after each input)");

System.out.println("\nPress [ENTER] to start");
String start = scan.nextLine();

    System.out.println("\033[H\033[2J");

    // Map, x, y, gems, level
    playLevel(levelOneMapGeneration(), 0, 0, 1, 1);
        System.out.println("\033[H\033[2J");

    playLevel(levelTwoMapGeneration(), 0, 2, 1, 2);
        System.out.println("\033[H\033[2J");

    playLevel(levelThreeMapGeneration(), 3, 4, 3, 3);
            System.out.println("\033[H\033[2J");
    playLevel(levelFourMapGeneration(), 3, 4, 3, 3);



  }
}

// ▓
// █