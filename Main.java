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

  static int levels = 0;

  public static void printing(String[][] levelOneMap, int gemsColected, int totalGems, int level) {

    for (int i = 0; i < levelOneMap[0].length + 2; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }
    System.out.print("\n");

    if(level < 10){
    for (int i = 0; i < 3; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }
    }
    else{
       for (int i = 0; i < 5; i++) {
      System.out.print(ANSI_BLUE + "▓");
    }
    }

    System.out.print(ANSI_RESET + "| Level " + level + " |");
    
  
    for (int i = 0; i < 5; i++) {
      System.out.print(ANSI_BLUE + "▓");
    }
   
    // ---------

    System.out.print("\n");

    for (int i = 0; i < levelOneMap[0].length + 2; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }
    System.out.print("\n");

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

        if (!(i == levelOneMap.length - 1)) {
          System.out.print("\n");
        }
      }
    }
    System.out.print("\n");

    for (int i = 0; i < levelOneMap[0].length + 2; i++) {
      System.out.print(ANSI_BLUE + "▓▓");
    }

    System.out.print("\n\n\n       " + ANSI_GREEN + "██ " + ANSI_RESET + totalGems + " - " + gemsColected);


    if(level == 20 || level == 21){
      System.out.print("\n\nCOLLECT THE YELLOW KEYS TO UNLOCK THE GEMS");
    }
        System.out.print("\n");


    System.out.print("\n\t\t |CONTROLS|");
    System.out.print("\nMOVMENT: [W][A][S][D] + [ENTER]");
    System.out.print("\nRESET  : [R] + [ENTER]");

    System.out.print("\n");
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

    for (int i = 0; i < levelOneMap[0].length - 1; i++) {

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

    levelOneMap[4][3] = ANSI_RESET + "██";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][2] = ANSI_BLUE + "▓▓";
    levelOneMap[1][3] = ANSI_BLUE + "▓▓";
    levelOneMap[4][2] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][2] = ANSI_BLUE + "▓▓";
    levelOneMap[3][1] = ANSI_BLUE + "▓▓";
    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][5] = ANSI_BLUE + "▓▓";
    levelOneMap[4][6] = ANSI_BLUE + "▓▓";
    levelOneMap[4][7] = ANSI_BLUE + "▓▓";
    levelOneMap[4][8] = ANSI_BLUE + "▓▓";
    levelOneMap[3][5] = ANSI_BLUE + "▓▓";
    levelOneMap[3][6] = ANSI_BLUE + "▓▓";
    levelOneMap[3][7] = ANSI_BLUE + "▓▓";
    levelOneMap[3][8] = ANSI_BLUE + "▓▓";
    levelOneMap[3][8] = ANSI_BLUE + "▓▓";
    levelOneMap[1][5] = ANSI_BLUE + "▓▓";
    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";

    // levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    // levelOneMap[1][3] = ANSI_BLUE + "▓▓";
    // levelOneMap[3][3] = ANSI_BLUE + "▓▓";
    // levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[2][0] = ANSI_GREEN + "██";
    levelOneMap[2][8] = ANSI_GREEN + "██";
    levelOneMap[0][4] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelFourMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[2][0] = ANSI_RESET + "██";

    levelOneMap[2][3] = ANSI_BLACK + "▓▓";
    levelOneMap[2][4] = ANSI_BLACK + "▓▓";
    levelOneMap[2][5] = ANSI_BLACK + "▓▓";
    levelOneMap[2][6] = ANSI_BLACK + "▓▓";
    levelOneMap[2][7] = ANSI_BLACK + "▓▓";

    levelOneMap[1][3] = ANSI_BLACK + "▓▓";
    levelOneMap[1][4] = ANSI_BLACK + "▓▓";
    levelOneMap[1][5] = ANSI_BLACK + "▓▓";
    levelOneMap[1][6] = ANSI_BLACK + "▓▓";
    levelOneMap[1][7] = ANSI_BLACK + "▓▓";

    levelOneMap[3][3] = ANSI_BLACK + "▓▓";
    levelOneMap[3][4] = ANSI_BLACK + "▓▓";
    levelOneMap[3][5] = ANSI_BLACK + "▓▓";
    levelOneMap[3][6] = ANSI_BLACK + "▓▓";
    levelOneMap[3][7] = ANSI_BLACK + "▓▓";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";

    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][1] = ANSI_BLUE + "▓▓";
    levelOneMap[3][2] = ANSI_BLUE + "▓▓";
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";
    levelOneMap[4][2] = ANSI_BLUE + "▓▓";

    levelOneMap[4][3] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelFiveMapGeneration() {

    String[][] levelOneMap = new String[4][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[1][7] = ANSI_RESET + "██";

    levelOneMap[1][8] = ANSI_BLACK + "▓▓";
    levelOneMap[0][0] = ANSI_BLACK + "▓▓";

    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][2] = ANSI_BLUE + "▓▓";
    levelOneMap[3][3] = ANSI_BLUE + "▓▓";
    levelOneMap[3][4] = ANSI_BLUE + "▓▓";
    levelOneMap[3][5] = ANSI_BLUE + "▓▓";
    levelOneMap[3][6] = ANSI_BLUE + "▓▓";
    levelOneMap[3][7] = ANSI_BLUE + "▓▓";
    levelOneMap[3][8] = ANSI_BLUE + "▓▓";

    // levelOneMap[0][0] = ANSI_BLUE + "▓▓";

    levelOneMap[0][8] = ANSI_GREEN + "██";
    levelOneMap[2][8] = ANSI_GREEN + "██";
    levelOneMap[3][1] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelSixMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[2][4] = ANSI_RESET + "██";

    levelOneMap[0][8] = ANSI_BLACK + "▓▓";
    levelOneMap[2][8] = ANSI_BLACK + "▓▓";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";

    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][1] = ANSI_BLUE + "▓▓";
    levelOneMap[3][2] = ANSI_BLUE + "▓▓";
    levelOneMap[3][3] = ANSI_BLUE + "▓▓";

    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";
    levelOneMap[4][2] = ANSI_BLUE + "▓▓";
    levelOneMap[4][3] = ANSI_BLUE + "▓▓";

    levelOneMap[3][8] = ANSI_BLUE + "▓▓";
    levelOneMap[4][8] = ANSI_BLUE + "▓▓";

    // levelOneMap[0][0] = ANSI_BLUE + "▓▓";

    levelOneMap[0][7] = ANSI_GREEN + "██";
    levelOneMap[1][8] = ANSI_GREEN + "██";
    levelOneMap[0][4] = ANSI_GREEN + "██";
    levelOneMap[4][4] = ANSI_GREEN + "██";
    levelOneMap[4][7] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelSevenMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[0][1] = ANSI_RESET + "██";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[2][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";

    levelOneMap[0][8] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
    levelOneMap[2][8] = ANSI_BLUE + "▓▓";
    levelOneMap[3][8] = ANSI_BLUE + "▓▓";
    levelOneMap[4][8] = ANSI_BLUE + "▓▓";
    
    levelOneMap[1][2] = ANSI_BLACK + "▓▓";
    levelOneMap[1][3] = ANSI_BLACK + "▓▓";
    levelOneMap[1][4] = ANSI_BLACK + "▓▓";
    levelOneMap[1][5] = ANSI_BLACK + "▓▓";
    levelOneMap[1][6] = ANSI_BLACK + "▓▓";
    levelOneMap[2][6] = ANSI_BLACK + "▓▓";
    levelOneMap[3][6] = ANSI_BLACK + "▓▓";

    levelOneMap[3][2] = ANSI_BLACK + "▓▓";
    levelOneMap[3][3] = ANSI_BLACK + "▓▓";
    levelOneMap[3][4] = ANSI_BLACK + "▓▓";
    levelOneMap[3][5] = ANSI_BLACK + "▓▓";
    levelOneMap[3][6] = ANSI_BLACK + "▓▓";
    
    levelOneMap[2][2] = ANSI_BLACK + "▓▓";


    levelOneMap[2][3] = ANSI_BLUE + "▓▓";
    levelOneMap[2][4] = ANSI_BLUE + "▓▓";
    levelOneMap[2][5] = ANSI_BLUE + "▓▓";

    levelOneMap[0][7] = ANSI_RED + "██";

    levelOneMap[4][7] = ANSI_GREEN + "██";
   

    return levelOneMap;

  }
  public static String[][] levelEightMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[2][0] = ANSI_RESET + "██";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";

    levelOneMap[3][2] = ANSI_BLACK + "▓▓";
    levelOneMap[0][3] = ANSI_BLACK + "▓▓";
    levelOneMap[0][4] = ANSI_BLACK + "▓▓";
    levelOneMap[0][5] = ANSI_BLACK + "▓▓";
    levelOneMap[0][6] = ANSI_BLACK + "▓▓";
    levelOneMap[0][7] = ANSI_BLACK + "▓▓";
    levelOneMap[2][8] = ANSI_BLACK + "▓▓";


        
    levelOneMap[2][2] = ANSI_RED + "██";

    levelOneMap[4][1] = ANSI_GREEN + "██";
    levelOneMap[0][2] = ANSI_GREEN + "██";
    levelOneMap[1][8] = ANSI_GREEN + "██";
   

    return levelOneMap;

  }

  public static String[][] levelNineMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[2][1] = ANSI_RESET + "██";

    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";
    levelOneMap[1][2] = ANSI_BLUE + "▓▓";
    levelOneMap[1][3] = ANSI_BLUE + "▓▓";
    levelOneMap[1][4] = ANSI_BLUE + "▓▓";
    levelOneMap[1][5] = ANSI_BLUE + "▓▓";
    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
    

    levelOneMap[4][8] = ANSI_BLACK + "▓▓";
    levelOneMap[2][0] = ANSI_BLACK + "▓▓";
    levelOneMap[0][1] = ANSI_BLACK + "▓▓";
    


        
    levelOneMap[4][1] = ANSI_RED + "██";
    levelOneMap[4][2] = ANSI_RED + "██";
    levelOneMap[4][3] = ANSI_RED + "██";
    levelOneMap[4][4] = ANSI_RED + "██";
    levelOneMap[4][5] = ANSI_RED + "██";
    levelOneMap[4][6] = ANSI_RED + "██";
    levelOneMap[4][7] = ANSI_RED + "██";

    levelOneMap[0][0] = ANSI_GREEN + "██";
    levelOneMap[1][1] = ANSI_GREEN + "██";
    levelOneMap[4][0] = ANSI_GREEN + "██";
    
   

    return levelOneMap;

  }

  public static String[][] levelTenMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[4][1] = ANSI_RESET + "██";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";

    levelOneMap[2][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    
    

    levelOneMap[4][8] = ANSI_BLACK + "▓▓";
    
    
        
    levelOneMap[3][8] = ANSI_RED + "██";
    

    levelOneMap[1][8] = ANSI_GREEN + "██";
    levelOneMap[2][7] = ANSI_GREEN + "██";
    levelOneMap[1][0] = ANSI_GREEN + "██";
    
    
    
   

    return levelOneMap;

  }

  public static String[][] levelElevenMapGeneration() {

    String[][] levelOneMap = new String[6][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[1][0] = ANSI_RESET + "██";

    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[5][0] = ANSI_BLUE + "▓▓";

    levelOneMap[1][3] = ANSI_BLUE + "▓▓";
    levelOneMap[1][4] = ANSI_BLUE + "▓▓";
    levelOneMap[1][5] = ANSI_BLUE + "▓▓";
    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
    
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";
    
    
    

    levelOneMap[0][2] = ANSI_BLACK + "▓▓";
    levelOneMap[5][1] = ANSI_BLACK + "▓▓";
    
    
        
    levelOneMap[0][0] = ANSI_RED + "██";
    levelOneMap[2][8] = ANSI_RED + "██";
    levelOneMap[4][8] = ANSI_RED + "██";
    

    levelOneMap[3][0] = ANSI_GREEN + "██";
    levelOneMap[1][2] = ANSI_GREEN + "██";
    levelOneMap[5][8] = ANSI_GREEN + "██";
    levelOneMap[3][8] = ANSI_GREEN + "██";
    
    
    
    
   

    return levelOneMap;

  }

  public static String[][] levelTwelveMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[0][2] = ANSI_RESET + "██";

    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";

    levelOneMap[2][2] = ANSI_BLACK + "▓▓";
    levelOneMap[3][2] = ANSI_BLACK + "▓▓";
    levelOneMap[4][2] = ANSI_BLACK + "▓▓";

    
        
    levelOneMap[0][8] = ANSI_RED + "██";


    levelOneMap[0][0] = ANSI_GREEN + "██";
    levelOneMap[3][0] = ANSI_GREEN + "██";
    levelOneMap[1][8] = ANSI_GREEN + "██";
    levelOneMap[4][8] = ANSI_GREEN + "██";
  
    
    
    
    
   

    return levelOneMap;

  }

  public static String[][] levelThirteenMapGeneration() {

    String[][] levelOneMap = new String[6][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[4][0] = ANSI_RESET + "██";

    levelOneMap[5][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";
    levelOneMap[2][0] = ANSI_BLUE + "▓▓";

    levelOneMap[4][3] = ANSI_BLACK + "▓▓";
    levelOneMap[4][4] = ANSI_BLACK + "▓▓";
    levelOneMap[4][5] = ANSI_BLACK + "▓▓";
    levelOneMap[4][6] = ANSI_BLACK + "▓▓";
    levelOneMap[4][7] = ANSI_BLACK + "▓▓";

    levelOneMap[3][3] = ANSI_BLACK + "▓▓";
    levelOneMap[3][4] = ANSI_BLACK + "▓▓";
    levelOneMap[3][5] = ANSI_BLACK + "▓▓";
    levelOneMap[3][6] = ANSI_BLACK + "▓▓";
    levelOneMap[3][7] = ANSI_BLACK + "▓▓";

    levelOneMap[1][1] = ANSI_BLACK + "▓▓";
    levelOneMap[5][1] = ANSI_BLACK + "▓▓";
   
    
        
    levelOneMap[3][0] = ANSI_RED + "██";
    levelOneMap[1][0] = ANSI_RED + "██";
    levelOneMap[2][3] = ANSI_RED + "██";
    levelOneMap[2][4] = ANSI_RED + "██";
    levelOneMap[2][5] = ANSI_RED + "██";
    levelOneMap[2][6] = ANSI_RED + "██";
    levelOneMap[2][7] = ANSI_RED + "██";

    levelOneMap[0][7] = ANSI_RED + "██";
    levelOneMap[0][6] = ANSI_RED + "██";
    levelOneMap[0][5] = ANSI_RED + "██";
    levelOneMap[0][4] = ANSI_RED + "██";
    levelOneMap[0][3] = ANSI_RED + "██";


    levelOneMap[0][0] = ANSI_GREEN + "██";
    levelOneMap[2][2] = ANSI_GREEN + "██";
    levelOneMap[2][8] = ANSI_GREEN + "██";
   
  
    
    
    
    
   

    return levelOneMap;

  }

  public static String[][] levelFourteenMapGeneration() {

    String[][] levelOneMap = new String[6][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[2][2] = ANSI_RESET + "██";

    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";

    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";
    levelOneMap[5][0] = ANSI_BLUE + "▓▓";
    levelOneMap[5][1] = ANSI_BLUE + "▓▓";
   

    levelOneMap[0][0] = ANSI_BLACK + "▓▓";
    levelOneMap[4][3] = ANSI_BLACK + "▓▓";
    levelOneMap[3][0] = ANSI_BLACK + "▓▓";
   
    levelOneMap[1][0] = ANSI_RED + "██";
    levelOneMap[4][8] = ANSI_RED + "██";


    levelOneMap[2][1] = ANSI_GREEN + "██";
    levelOneMap[1][8] = ANSI_GREEN + "██";
    levelOneMap[3][8] = ANSI_GREEN + "██";
    levelOneMap[5][8] = ANSI_GREEN + "██";

    return levelOneMap;

  }

  public static String[][] levelFifthteenMapGeneration() {

    String[][] levelOneMap = new String[7][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[3][3] = ANSI_RESET + "██";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";

    levelOneMap[6][0] = ANSI_BLUE + "▓▓";
    levelOneMap[6][1] = ANSI_BLUE + "▓▓";
    levelOneMap[6][2] = ANSI_BLUE + "▓▓";
    levelOneMap[5][0] = ANSI_BLUE + "▓▓";
   
    levelOneMap[0][8] = ANSI_BLACK + "▓▓";
    levelOneMap[6][8] = ANSI_BLACK + "▓▓";

    levelOneMap[3][2] = ANSI_BLACK + "▓▓";
    levelOneMap[3][1] = ANSI_BLACK + "▓▓";
  
    levelOneMap[0][3] = ANSI_RED + "██";
    levelOneMap[2][3] = ANSI_RED + "██";
    levelOneMap[4][3] = ANSI_RED + "██";
    levelOneMap[6][3] = ANSI_RED + "██";

    levelOneMap[2][1] = ANSI_GREEN + "██";
    levelOneMap[4][1] = ANSI_GREEN + "██";
    levelOneMap[1][3] = ANSI_GREEN + "██";
    levelOneMap[5][3] = ANSI_GREEN + "██";
    levelOneMap[3][8] = ANSI_GREEN + "██";


    return levelOneMap;

  }

  public static String[][] levelSixteenthMapGeneration() {

    String[][] levelOneMap = new String[7][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[5][0] = ANSI_RESET + "██";

    levelOneMap[0][0] = ANSI_BLUE + "▓▓";

    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";

    levelOneMap[6][0] = ANSI_BLUE + "▓▓";
    levelOneMap[6][1] = ANSI_BLUE + "▓▓";
    levelOneMap[6][2] = ANSI_BLUE + "▓▓";

    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[3][1] = ANSI_BLUE + "▓▓";
    
    
   
    levelOneMap[0][0] = ANSI_BLACK + "▓▓";
    levelOneMap[2][2] = ANSI_BLACK + "▓▓";
    levelOneMap[4][8] = ANSI_BLACK + "▓▓";

  
    levelOneMap[0][1] = ANSI_RED + "██";
    levelOneMap[5][8] = ANSI_RED + "██";
    

    levelOneMap[6][8] = ANSI_GREEN + "██";
    levelOneMap[1][1] = ANSI_GREEN + "██";
    levelOneMap[2][1] = ANSI_GREEN + "██";
    levelOneMap[3][2] = ANSI_GREEN + "██";
   


    return levelOneMap;

  }

  public static String[][] levelSeventeenMapGeneration() {

    String[][] levelOneMap = new String[6][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[0][2] = ANSI_RESET + "██";

      
    
   
    levelOneMap[0][3] = ANSI_BLACK + "▓▓";
    levelOneMap[3][0] = ANSI_BLACK + "▓▓";
    levelOneMap[5][3] = ANSI_BLACK + "▓▓";
    levelOneMap[2][2] = ANSI_BLACK + "▓▓";
    levelOneMap[3][1] = ANSI_BLACK + "▓▓";


  
    levelOneMap[0][0] = ANSI_RED + "██";
    levelOneMap[0][4] = ANSI_RED + "██";
    levelOneMap[0][5] = ANSI_RED + "██";
    levelOneMap[0][6] = ANSI_RED + "██";
    levelOneMap[0][7] = ANSI_RED + "██";
    levelOneMap[0][8] = ANSI_BLACK + "██";

    levelOneMap[5][4] = ANSI_RED + "██";
    levelOneMap[5][5] = ANSI_RED + "██";
    levelOneMap[5][6] = ANSI_RED + "██";
    levelOneMap[5][7] = ANSI_RED + "██";
    levelOneMap[5][8] = ANSI_BLACK + "██";

    levelOneMap[2][4] = ANSI_BLACK + "██";
    levelOneMap[2][5] = ANSI_RED + "██";
    levelOneMap[2][6] = ANSI_RED + "██";
    levelOneMap[2][7] = ANSI_BLACK + "██";

    levelOneMap[3][4] = ANSI_BLACK + "██";
    levelOneMap[3][5] = ANSI_RED + "██";
    levelOneMap[3][6] = ANSI_RED + "██";
    levelOneMap[3][7] = ANSI_BLACK + "██";
    

    levelOneMap[0][1] = ANSI_GREEN + "██";
    levelOneMap[2][1] = ANSI_GREEN + "██";
    levelOneMap[3][2] = ANSI_GREEN + "██";
    levelOneMap[5][2] = ANSI_GREEN + "██";
    levelOneMap[1][7] = ANSI_GREEN + "██";
    levelOneMap[4][7] = ANSI_GREEN + "██";
 
    return levelOneMap;

  }

  public static String[][] levelEighteenMapGeneration() {

    String[][] levelOneMap = new String[7][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[3][5] = ANSI_RESET + "██";

      
    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[0][2] = ANSI_BLUE + "▓▓";

    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][2] = ANSI_BLUE + "▓▓";

    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓"; 

    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
    
    levelOneMap[5][0] = ANSI_BLUE + "▓▓";
    levelOneMap[5][1] = ANSI_BLUE + "▓▓";
    levelOneMap[5][2] = ANSI_BLUE + "▓▓";

    levelOneMap[6][0] = ANSI_BLUE + "▓▓";
    levelOneMap[6][1] = ANSI_BLUE + "▓▓";
    levelOneMap[6][2] = ANSI_BLUE + "▓▓";

    levelOneMap[5][6] = ANSI_BLUE + "▓▓";
    levelOneMap[5][7] = ANSI_BLUE + "▓▓";
    levelOneMap[5][8] = ANSI_BLUE + "▓▓";
    levelOneMap[6][6] = ANSI_BLUE + "▓▓";
    levelOneMap[6][7] = ANSI_BLUE + "▓▓";
    levelOneMap[6][8] = ANSI_BLUE + "▓▓";



    levelOneMap[1][3] = ANSI_BLACK + "▓▓";
    levelOneMap[1][4] = ANSI_BLACK + "▓▓";
    levelOneMap[4][4] = ANSI_BLACK + "▓▓";

    levelOneMap[6][4] = ANSI_RED + "██";
    levelOneMap[3][4] = ANSI_RED + "██";



    levelOneMap[0][3] = ANSI_GREEN + "██";
    levelOneMap[0][5] = ANSI_GREEN + "██";
    levelOneMap[6][3] = ANSI_GREEN + "██";
    levelOneMap[6][5] = ANSI_GREEN + "██";
 
    return levelOneMap;

  }

  public static String[][] levelNineteenMapGeneration() {

    String[][] levelOneMap = new String[6][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[4][8] = ANSI_RESET + "██";

      
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";
    levelOneMap[5][0] = ANSI_BLUE + "▓▓";
    levelOneMap[5][1] = ANSI_BLUE + "▓▓";

    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";
    
    levelOneMap[1][3] = ANSI_BLUE + "▓▓";
    levelOneMap[1][4] = ANSI_BLUE + "▓▓";
    levelOneMap[1][5] = ANSI_BLUE + "▓▓";
    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";

    levelOneMap[0][0] = ANSI_BLACK + "▓▓";
    levelOneMap[5][2] = ANSI_BLACK + "▓▓";
    levelOneMap[5][3] = ANSI_BLACK + "▓▓";
    levelOneMap[5][4] = ANSI_BLACK + "▓▓";
    levelOneMap[5][5] = ANSI_BLACK + "▓▓";
    levelOneMap[5][6] = ANSI_BLACK + "▓▓";
    levelOneMap[5][7] = ANSI_BLACK + "▓▓";

    levelOneMap[0][2] = ANSI_RED + "██";
    levelOneMap[5][8] = ANSI_RED + "██";


    levelOneMap[3][0] = ANSI_GREEN + "██";
    levelOneMap[3][8] = ANSI_GREEN + "██";
    levelOneMap[2][2] = ANSI_GREEN + "██";
    levelOneMap[4][2] = ANSI_GREEN + "██";
 
    return levelOneMap;

  }

  public static String[][] levelTwentyMapGeneration() {

    String[][] levelOneMap = new String[2][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[0][0] = ANSI_RESET + "██";

    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][2] = ANSI_BLUE + "▓▓";

    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
      
    levelOneMap[0][4] = ANSI_PURPLE + "██";

    levelOneMap[0][8] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static String[][] levelTwentyOneMapGeneration() {

    String[][] levelOneMap = new String[5][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[0][2] = ANSI_RESET + "██";


    // levelOneMap[1][6] = ANSI_BLUE + "▓▓";

    levelOneMap[1][4] = ANSI_BLACK + "▓▓";
    levelOneMap[0][3] = ANSI_BLACK + "▓▓";
    
    levelOneMap[3][7] = ANSI_BLACK + "▓▓";
    levelOneMap[2][7] = ANSI_RED + "██";
    levelOneMap[1][7] = ANSI_RED + "██";
    levelOneMap[0][7] = ANSI_BLACK + "▓▓";
    
    levelOneMap[2][3] = ANSI_RED + "██";
    levelOneMap[0][0] = ANSI_RED + "██";
    levelOneMap[4][0] = ANSI_RED + "██";

    levelOneMap[4][2] = ANSI_PURPLE + "██";
    levelOneMap[0][4] = ANSI_PURPLE + "██";
    levelOneMap[0][8] = ANSI_PURPLE + "██";

    levelOneMap[3][3] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static String[][] levelTwentyTwoMapGeneration() {

    String[][] levelOneMap = new String[6][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[0][6] = ANSI_RESET + "██";
    levelOneMap[0][5] = ANSI_BLACK + "▓▓";


    levelOneMap[0][4] = ANSI_RED + "██";
    levelOneMap[1][4] = ANSI_PURPLE + "██";

    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[1][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][2] = ANSI_BLUE + "▓▓";
    levelOneMap[1][2] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";
    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";

    levelOneMap[3][3] = ANSI_BLUE + "▓▓";
    levelOneMap[4][3] = ANSI_BLUE + "▓▓";
    levelOneMap[5][3] = ANSI_BLUE + "▓▓";
    levelOneMap[3][2] = ANSI_BLUE + "▓▓";
    levelOneMap[4][2] = ANSI_BLUE + "▓▓";
    levelOneMap[5][2] = ANSI_BLUE + "▓▓";
    levelOneMap[3][1] = ANSI_BLUE + "▓▓";
    levelOneMap[4][1] = ANSI_BLUE + "▓▓";
    levelOneMap[5][1] = ANSI_BLUE + "▓▓";
    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[4][0] = ANSI_BLUE + "▓▓";
    levelOneMap[5][0] = ANSI_BLUE + "▓▓";

    levelOneMap[0][8] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";
    levelOneMap[2][8] = ANSI_BLUE + "▓▓";

    levelOneMap[5][5] = ANSI_BLACK + "▓▓";
    
    levelOneMap[1][6] = ANSI_RED + "██";
    

    levelOneMap[1][5] = ANSI_PURPLE + "██";
    levelOneMap[3][6] = ANSI_PURPLE + "██";
    levelOneMap[5][4] = ANSI_PURPLE + "██";
    levelOneMap[4][4] = ANSI_PURPLE + "██";
    levelOneMap[3][4] = ANSI_BLACK + "▓▓";
    levelOneMap[5][8] = ANSI_PURPLE + "██";
    levelOneMap[2][0] = ANSI_PURPLE + "██";
    
    levelOneMap[2][6] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static String[][] levelTwentyThreeMapGeneration() {

    String[][] levelOneMap = new String[4][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[3][1] = ANSI_RESET + "██";
    levelOneMap[2][3] = ANSI_BLACK + "▓▓";


    levelOneMap[0][0] = ANSI_RED + "██";

    levelOneMap[3][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][3] = ANSI_BLUE + "▓▓";
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";

    levelOneMap[3][3] = ANSI_BLUE + "▓▓";
    levelOneMap[3][4] = ANSI_BLUE + "▓▓";
    levelOneMap[3][5] = ANSI_BLUE + "▓▓";
    levelOneMap[3][6] = ANSI_BLUE + "▓▓";
    levelOneMap[3][7] = ANSI_BLUE + "▓▓";
    levelOneMap[3][8] = ANSI_BLUE + "▓▓";

        

    levelOneMap[2][0] = ANSI_GREEN + "██";
    levelOneMap[2][8] = ANSI_GREEN + "██";

    levelOneMap[0][2] = ANSI_PURPLE + "██";
    
    levelOneMap[1][1] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static String[][] levelTwentyFourMapGeneration() {

    String[][] levelOneMap = new String[7][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[1][2] = ANSI_RESET + "██";


    levelOneMap[0][0] = ANSI_BLUE + "▓▓";
    levelOneMap[0][1] = ANSI_BLUE + "▓▓";
    levelOneMap[1][0] = ANSI_BLUE + "▓▓";
    levelOneMap[1][1] = ANSI_BLUE + "▓▓";

    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[0][5] = ANSI_BLUE + "▓▓";
    levelOneMap[0][6] = ANSI_BLUE + "▓▓";
    levelOneMap[0][7] = ANSI_BLUE + "▓▓";
    levelOneMap[0][8] = ANSI_BLUE + "▓▓";

    levelOneMap[1][4] = ANSI_BLUE + "▓▓";
    levelOneMap[1][5] = ANSI_BLUE + "▓▓";
    levelOneMap[1][6] = ANSI_BLUE + "▓▓";
    levelOneMap[1][7] = ANSI_BLUE + "▓▓";
    levelOneMap[1][8] = ANSI_BLUE + "▓▓";

    levelOneMap[5][4] = ANSI_BLUE + "▓▓";
    levelOneMap[5][5] = ANSI_BLUE + "▓▓";
    levelOneMap[5][6] = ANSI_BLUE + "▓▓";
    levelOneMap[5][7] = ANSI_BLUE + "▓▓";
    levelOneMap[5][8] = ANSI_BLUE + "▓▓";
    
    levelOneMap[6][4] = ANSI_BLUE + "▓▓";
    levelOneMap[6][5] = ANSI_BLUE + "▓▓";
    levelOneMap[6][6] = ANSI_BLUE + "▓▓";
    levelOneMap[6][7] = ANSI_BLUE + "▓▓";
    levelOneMap[6][8] = ANSI_BLUE + "▓▓";
    

    levelOneMap[5][0] = ANSI_BLUE + "▓▓";
    levelOneMap[6][0] = ANSI_BLUE + "▓▓";

    levelOneMap[5][3] = ANSI_BLUE + "▓▓";
    levelOneMap[6][3] = ANSI_BLUE + "▓▓";

    levelOneMap[3][1] = ANSI_BLACK + "▓▓";
    levelOneMap[3][3] = ANSI_BLACK + "▓▓";
    levelOneMap[3][5] = ANSI_BLACK + "▓▓";
    levelOneMap[3][7] = ANSI_BLACK + "▓▓";


        
    levelOneMap[0][3] = ANSI_GREEN + "██";
    levelOneMap[6][1] = ANSI_GREEN + "██";

    levelOneMap[4][4] = ANSI_PURPLE + "██";
    levelOneMap[2][4] = ANSI_PURPLE + "██";

    levelOneMap[4][6] = ANSI_PURPLE + "██";
    levelOneMap[2][6] = ANSI_PURPLE + "██";

    levelOneMap[4][8] = ANSI_PURPLE + "██";
    levelOneMap[2][8] = ANSI_PURPLE + "██";

    levelOneMap[4][0] = ANSI_PURPLE + "██";
    levelOneMap[2][0] = ANSI_PURPLE + "██";
    
    levelOneMap[1][3] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static String[][] levelTwentyFiveMapGeneration() {

    String[][] levelOneMap = new String[7][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[3][0] = ANSI_RESET + "██";


    levelOneMap[0][4] = ANSI_PURPLE + "██";
   

    levelOneMap[1][4] = ANSI_BLACK + "▓▓";
    levelOneMap[1][5] = ANSI_BLACK + "▓▓";
    levelOneMap[1][6] = ANSI_BLACK + "▓▓";
    levelOneMap[1][7] = ANSI_BLACK + "▓▓";
    levelOneMap[1][8] = ANSI_BLACK + "▓▓";

    levelOneMap[2][4] = ANSI_BLACK + "▓▓";
    levelOneMap[2][5] = ANSI_BLACK + "▓▓";
    levelOneMap[2][6] = ANSI_BLACK + "▓▓";
    levelOneMap[2][7] = ANSI_BLACK + "▓▓";
    levelOneMap[2][8] = ANSI_BLACK + "▓▓";


    
    levelOneMap[2][2] = ANSI_RED + "██";
    levelOneMap[4][2] = ANSI_RED + "██";
    

    levelOneMap[0][0] = ANSI_PURPLE + "██";
    levelOneMap[0][8] = ANSI_GREEN + "██";
    levelOneMap[6][0] = ANSI_PURPLE + "██";
    levelOneMap[6][8] = ANSI_GREEN + "██";

    levelOneMap[2][1] = ANSI_GREEN + "██";
    levelOneMap[2][3] = ANSI_GREEN + "██";
    levelOneMap[4][1] = ANSI_GREEN + "██";
    levelOneMap[4][3] = ANSI_GREEN + "██";
    
    levelOneMap[3][2] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static String[][] levelTwentySixMapGeneration() {

    String[][] levelOneMap = new String[7][9];

    for (int i = 0; i < levelOneMap.length; i++) {
      for (int j = 0; j < levelOneMap[0].length; j++) {

        levelOneMap[i][j] = ANSI_BLUE + "██";
      }
    }

    levelOneMap[3][4] = ANSI_RESET + "██";


   

    levelOneMap[4][5] = ANSI_BLACK + "▓▓";
    levelOneMap[0][2] = ANSI_BLACK + "▓▓";
    levelOneMap[6][2] = ANSI_BLACK + "▓▓";

    levelOneMap[0][1] = ANSI_BLACK + "▓▓";
    levelOneMap[1][1] = ANSI_BLACK + "▓▓";
    levelOneMap[2][1] = ANSI_BLACK + "▓▓";
    levelOneMap[3][1] = ANSI_BLACK + "▓▓";
    levelOneMap[4][1] = ANSI_BLACK + "▓▓";
    levelOneMap[5][1] = ANSI_BLACK + "▓▓";
    levelOneMap[6][1] = ANSI_BLACK + "▓▓";

    levelOneMap[0][7] = ANSI_BLACK + "▓▓";
    levelOneMap[1][7] = ANSI_BLACK + "▓▓";
    levelOneMap[2][7] = ANSI_BLACK + "▓▓";
    levelOneMap[3][7] = ANSI_BLACK + "▓▓";
    levelOneMap[4][7] = ANSI_BLACK + "▓▓";
    levelOneMap[5][7] = ANSI_BLACK + "▓▓";
    levelOneMap[6][7] = ANSI_BLACK + "▓▓";

    levelOneMap[0][8] = ANSI_RED + "██";
    levelOneMap[1][8] = ANSI_RED + "██";
    levelOneMap[2][8] = ANSI_RED + "██";
    levelOneMap[3][8] = ANSI_RED + "██";
    levelOneMap[4][8] = ANSI_RED + "██";
    levelOneMap[5][8] = ANSI_RED + "██";
    levelOneMap[6][8] = ANSI_RED + "██";

    levelOneMap[0][0] = ANSI_RED + "██";
    levelOneMap[1][0] = ANSI_RED + "██";
    levelOneMap[2][0] = ANSI_RED + "██";
    levelOneMap[3][0] = ANSI_RED + "██";
    levelOneMap[4][0] = ANSI_RED + "██";
    levelOneMap[5][0] = ANSI_RED + "██";
    levelOneMap[6][0] = ANSI_RED + "██";

  
    levelOneMap[0][3] = ANSI_RED + "██";
    levelOneMap[6][3] = ANSI_RED + "██";
    
    levelOneMap[0][4] = ANSI_BLUE + "▓▓";
    levelOneMap[1][4] = ANSI_BLUE + "▓▓";

    levelOneMap[5][4] = ANSI_BLUE + "▓▓";
    levelOneMap[6][4] = ANSI_BLUE + "▓▓";

    levelOneMap[2][6] = ANSI_PURPLE + "██";
    levelOneMap[4][6] = ANSI_PURPLE + "██";

    levelOneMap[1][3] = ANSI_GREEN + "██";
    levelOneMap[5][3] = ANSI_GREEN + "██";
    
    levelOneMap[1][6] = ANSI_GREEN + "██";
    levelOneMap[5][6] = ANSI_GREEN + "██";
    
    levelOneMap[4][2] = ANSI_YELLOW + "██";

 
    return levelOneMap;

  }

  public static void playLevel(String[][] levelOneMap, int playerXPosition, int playerYPosition, int totalGems, int level) {

    Scanner scan = new Scanner(System.in);
    int gemCount = 0;

    int count = 0;
    String movment = "";

    printing(levelOneMap, gemCount, totalGems, level);

    while (true) {

      if(count < 1){
      movment = scan.nextLine();
      }

      if (movment.equals("r")) {
        if (level == 1) {
          levelOneMap = levelOneMapGeneration();
          playerXPosition = 0;
          playerYPosition = 0;
        }
        if (level == 2) {
          levelOneMap = levelTwoMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;

        }
        if (level == 3) {
          levelOneMap = levelThreeMapGeneration();
          playerXPosition = 3;
          playerYPosition = 4;
        }
        if (level == 4) {
          levelOneMap = levelFourMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;
        }
        if (level == 5) {
          levelOneMap = levelFiveMapGeneration();
          playerXPosition = 7;
          playerYPosition = 1;
        }
        if (level == 6) {
          levelOneMap = levelSixMapGeneration();
          playerXPosition = 4;
          playerYPosition = 2;
        }

        if(level == 7){
          levelOneMap = levelSevenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 0;
        }
        if(level == 8){
          levelOneMap = levelEightMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;
        }
        if(level == 9){
          levelOneMap = levelNineMapGeneration();
          playerXPosition = 1;
          playerYPosition = 2;
        }
        if(level == 10){
          levelOneMap = levelTenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 4;
        }
        if(level == 11){
          levelOneMap = levelElevenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 1;
        }

        if(level == 12){
          levelOneMap = levelTwelveMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }

        if(level == 13){
          levelOneMap = levelThirteenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 4;
        }

        if(level == 14){
          levelOneMap = levelFourteenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 2;
        }

        if(level == 15){
          levelOneMap = levelFifthteenMapGeneration();
          playerXPosition = 3;
          playerYPosition = 3;
        }

        if(level == 16){
          levelOneMap = levelSixteenthMapGeneration();
          playerXPosition = 0;
          playerYPosition = 5;
        }
        if(level == 17){
          levelOneMap = levelSeventeenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }

        if(level == 18){
          levelOneMap = levelEighteenMapGeneration();
          playerXPosition = 5;
          playerYPosition = 3;
        }
        
        if(level == 19){
          levelOneMap = levelNineteenMapGeneration();
          playerXPosition = 8;
          playerYPosition = 4;
        }

        if(level == 20){
          levelOneMap = levelTwentyMapGeneration();
          playerXPosition = 0;
          playerYPosition = 0;
        }

        if(level == 21){
          levelOneMap = levelTwentyOneMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }

        if(level == 22){
          levelOneMap = levelTwentyTwoMapGeneration();
          playerXPosition = 6;
          playerYPosition = 0;
        }

        if(level == 23){
          levelOneMap = levelTwentyThreeMapGeneration();
          playerXPosition = 1;
          playerYPosition = 3;
        }

        if(level == 24){
          levelOneMap = levelTwentyFourMapGeneration();
          playerXPosition = 2;
          playerYPosition = 1;
        }

        if(level == 25){
          levelOneMap = levelTwentyFiveMapGeneration();
          playerXPosition = 0;
          playerYPosition = 3;
        }

        if(level == 26){
          levelOneMap = levelTwentySixMapGeneration();
          playerXPosition = 4;
          playerYPosition = 3;
        }
        


        gemCount = 0;
        System.out.println("\033[H\033[2J");
        System.out.flush();
        printing(levelOneMap, gemCount, totalGems, level);

      }

      if (playerXPosition < levelOneMap[0].length - 1) {
        if (movment.equals("d") && levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_BLUE + "██")) {

          while (playerXPosition < levelOneMap[0].length - 1) {
            if (levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_BLUE + "██")) {
              System.out.println("\033[H\033[2J");
              System.out.flush();
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
              System.out.flush();
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
              System.out.flush();
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
              System.out.flush();
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

      if (playerXPosition < levelOneMap[0].length - 1) {

        if (movment.equals("d")) {

          if (levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_RED + "██")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";

        if(level == 7){
          levelOneMap = levelSevenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 0;
        }
        if(level == 8){
          levelOneMap = levelEightMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;
        }
        if(level == 9){
          levelOneMap = levelNineMapGeneration();
          playerXPosition = 1;
          playerYPosition = 2;
        }
        if(level == 10){
          levelOneMap = levelTenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 4;
        }
        if(level == 11){
          levelOneMap = levelElevenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 1;
        }
        if(level == 12){
          levelOneMap = levelTwelveMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 13){
          levelOneMap = levelThirteenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 4;
        }
        if(level == 14){
          levelOneMap = levelFourteenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 2;
        }
        if(level == 15){
          levelOneMap = levelFifthteenMapGeneration();
          playerXPosition = 3;
          playerYPosition = 3;
        }
        if(level == 16){
          levelOneMap = levelSixteenthMapGeneration();
          playerXPosition = 0;
          playerYPosition = 5;
        }
        if(level == 17){
          levelOneMap = levelSeventeenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 18){
          levelOneMap = levelEighteenMapGeneration();
          playerXPosition = 5;
          playerYPosition = 3;
        }
        if(level == 19){
          levelOneMap = levelNineteenMapGeneration();
          playerXPosition = 8;
          playerYPosition = 4;
        }
        if(level == 20){
          levelOneMap = levelTwentyMapGeneration();
          playerXPosition = 0;
          playerYPosition = 0;
        }
        if(level == 21){
          levelOneMap = levelTwentyOneMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 22){
          levelOneMap = levelTwentyTwoMapGeneration();
          playerXPosition = 6;
          playerYPosition = 0;
        }
        if(level == 23){
          levelOneMap = levelTwentyThreeMapGeneration();
          playerXPosition = 1;
          playerYPosition = 3;
        }
        if(level == 24){
          levelOneMap = levelTwentyFourMapGeneration();
          playerXPosition = 2;
          playerYPosition = 1;
        }
        if(level == 25){
          levelOneMap = levelTwentyFiveMapGeneration();
          playerXPosition = 0;
          playerYPosition = 3;
        }
        if(level == 26){
          levelOneMap = levelTwentySixMapGeneration();
          playerXPosition = 4;
          playerYPosition = 3;
        }

  gemCount = 0;
printing(levelOneMap, gemCount, totalGems, level);

          }
          else{
          if (levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_GREEN + "██")) {
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition][playerXPosition + 1] = ANSI_RESET + "██";
            gemCount++;
            playerXPosition++;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          if(playerXPosition < levelOneMap[0].length - 1){
          if (levelOneMap[playerYPosition][playerXPosition + 1].equals(ANSI_YELLOW + "██")) {
            for(int i = 0; i < levelOneMap.length; i++){
              for(int j = 0; j < levelOneMap[0].length; j++){
                if(levelOneMap[i][j].equals(ANSI_PURPLE + "██")){
                  levelOneMap[i][j] = ANSI_GREEN + "██";
                }
              }
            }
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition][playerXPosition + 1] = ANSI_RESET + "██";
            playerXPosition++;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          }
          }

          

        }
      }
      if(playerXPosition > 0){
        if (movment.equals("a")) {

 if (levelOneMap[playerYPosition][playerXPosition - 1].equals(ANSI_RED + "██")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            
            

        if(level == 7){
          levelOneMap = levelSevenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 0;
        }
        if(level == 8){
          levelOneMap = levelEightMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;
        }
        if(level == 9){
          levelOneMap = levelNineMapGeneration();
          playerXPosition = 1;
          playerYPosition = 2;
        }
        if(level == 10){
          levelOneMap = levelTenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 4;
        }
        if(level == 11){
          levelOneMap = levelElevenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 1;
        }
        if(level == 12){
          levelOneMap = levelTwelveMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 13){
          levelOneMap = levelThirteenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 4;
        }
        if(level == 14){
          levelOneMap = levelFourteenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 2;
        }
        if(level == 15){
          levelOneMap = levelFifthteenMapGeneration();
          playerXPosition = 3;
          playerYPosition = 3;
        }
        if(level == 16){
          levelOneMap = levelSixteenthMapGeneration();
          playerXPosition = 0;
          playerYPosition = 5;
        }
        if(level == 17){
          levelOneMap = levelSeventeenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 18){
          levelOneMap = levelEighteenMapGeneration();
          playerXPosition = 5;
          playerYPosition = 3;
        }
        if(level == 19){
          levelOneMap = levelNineteenMapGeneration();
          playerXPosition = 8;
          playerYPosition = 4;
        }
        if(level == 20){
          levelOneMap = levelNineteenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 0;
        }
        if(level == 21){
          levelOneMap = levelTwentyOneMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 22){
          levelOneMap = levelTwentyTwoMapGeneration();
          playerXPosition = 6;
          playerYPosition = 0;
        }
        if(level == 23){
          levelOneMap = levelTwentyThreeMapGeneration();
          playerXPosition = 1;
          playerYPosition = 3;
        }
        if(level == 24){
          levelOneMap = levelTwentyFourMapGeneration();
          playerXPosition = 2;
          playerYPosition = 1;
        }
        if(level == 25){
          levelOneMap = levelTwentyFiveMapGeneration();
          playerXPosition = 0;
          playerYPosition = 3;
        }
        if(level == 26){
          levelOneMap = levelTwentySixMapGeneration();
          playerXPosition = 4;
          playerYPosition = 3;
        }

        gemCount = 0;
            
printing(levelOneMap, gemCount, totalGems, level);

          }
          else{
          if (levelOneMap[playerYPosition][playerXPosition - 1].equals(ANSI_GREEN + "██")) {
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition][playerXPosition - 1] = ANSI_RESET + "██";
            gemCount++;
            playerXPosition--;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          if(playerXPosition > 0){
          if (levelOneMap[playerYPosition][playerXPosition - 1].equals(ANSI_YELLOW + "██")) {
            for(int i = 0; i < levelOneMap.length; i++){
              for(int j = 0; j < levelOneMap[0].length; j++){
                if(levelOneMap[i][j].equals(ANSI_PURPLE + "██")){
                  levelOneMap[i][j] = ANSI_GREEN + "██";
                }
              }
            }
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition][playerXPosition - 1] = ANSI_RESET + "██";
            playerXPosition--;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          }
          }

         

        }

      }
      if (playerYPosition > 0) {
        if (movment.equals("w")) {

          if (levelOneMap[playerYPosition - 1][playerXPosition].equals(ANSI_RED + "██")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            
          

        if(level == 7){
          levelOneMap = levelSevenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 0;
        }
        if(level == 8){
          levelOneMap = levelEightMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;
        }
        if(level == 9){
          levelOneMap = levelNineMapGeneration();
          playerXPosition = 1;
          playerYPosition = 2;
        }
        if(level == 10){
          levelOneMap = levelTenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 4;
        }
        if(level == 11){
          levelOneMap = levelElevenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 1;
        }
        if(level == 12){
          levelOneMap = levelTwelveMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 13){
          levelOneMap = levelThirteenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 4;
        }
        if(level == 14){
          levelOneMap = levelFourteenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 2;
        }
        if(level == 15){
          levelOneMap = levelFifthteenMapGeneration();
          playerXPosition = 3;
          playerYPosition = 3;
        }
        if(level == 16){
          levelOneMap = levelSixteenthMapGeneration();
          playerXPosition = 0;
          playerYPosition = 5;
        }
        if(level == 17){
          levelOneMap = levelSeventeenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 18){
          levelOneMap = levelEighteenMapGeneration();
          playerXPosition = 5;
          playerYPosition = 3;
        }
        if(level == 19){
          levelOneMap = levelNineteenMapGeneration();
          playerXPosition = 8;
          playerYPosition = 4;
        }
        if(level == 20){
          levelOneMap = levelTwentyMapGeneration();
          playerXPosition = 0;
          playerYPosition = 0;
        }
        if(level == 21){
          levelOneMap = levelTwentyOneMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 22){
          levelOneMap = levelTwentyTwoMapGeneration();
          playerXPosition = 6;
          playerYPosition = 0;
        }
        if(level == 23){
          levelOneMap = levelTwentyThreeMapGeneration();
          playerXPosition = 1;
          playerYPosition = 3;
        }
        if(level == 24){
          levelOneMap = levelTwentyFourMapGeneration();
          playerXPosition = 2;
          playerYPosition = 1;
        }
        if(level == 25){
          levelOneMap = levelTwentyFiveMapGeneration();
          playerXPosition = 0;
          playerYPosition = 3;
        }
        if(level == 26){
          levelOneMap = levelTwentySixMapGeneration();
          playerXPosition = 4;
          playerYPosition = 3;
        }
        gemCount = 0;
           printing(levelOneMap, gemCount, totalGems, level); 


          }
          else{

          if (levelOneMap[playerYPosition - 1][playerXPosition].equals(ANSI_GREEN + "██")) {
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition - 1][playerXPosition] = ANSI_RESET + "██";
            gemCount++;
            playerYPosition--;
            printing(levelOneMap, gemCount, totalGems, level);
          }

          if(playerYPosition > 0){
          if (levelOneMap[playerYPosition - 1][playerXPosition].equals(ANSI_YELLOW + "██")) {
            for(int i = 0; i < levelOneMap.length; i++){
              for(int j = 0; j < levelOneMap[0].length; j++){
                if(levelOneMap[i][j].equals(ANSI_PURPLE + "██")){
                  levelOneMap[i][j] = ANSI_GREEN + "██";
                }
              }
            }
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition - 1][playerXPosition] = ANSI_RESET + "██";
            playerYPosition--;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          }
          }
          

        }
      }

        if(playerYPosition < levelOneMap.length - 1){

        if (movment.equals("s")) {

          if (levelOneMap[playerYPosition + 1][playerXPosition].equals(ANSI_RED + "██")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            
            
        if(level == 7){
          levelOneMap = levelSevenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 0;
          
        }
        if(level == 8){
          levelOneMap = levelEightMapGeneration();
          playerXPosition = 0;
          playerYPosition = 2;
        }
        if(level == 9){
          levelOneMap = levelNineMapGeneration();
          playerXPosition = 1;
          playerYPosition = 2;
        }
        if(level == 10){
          levelOneMap = levelTenMapGeneration();
          playerXPosition = 1;
          playerYPosition = 4;
        }
        if(level == 11){
          levelOneMap = levelElevenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 1;
        }
        if(level == 12){
          levelOneMap = levelTwelveMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 13){
          levelOneMap = levelThirteenMapGeneration();
          playerXPosition = 0;
          playerYPosition = 4;
        }
        if(level == 14){
          levelOneMap = levelFourteenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 2;
        }
        if(level == 15){
          levelOneMap = levelFifthteenMapGeneration();
          playerXPosition = 3;
          playerYPosition = 3;
        }
        if(level == 16){
          levelOneMap = levelSixteenthMapGeneration();
          playerXPosition = 0;
          playerYPosition = 5;
        }
        if(level == 17){
          levelOneMap = levelSeventeenMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 18){
          levelOneMap = levelEighteenMapGeneration();
          playerXPosition = 5;
          playerYPosition = 3;
        }
        if(level == 19){
          levelOneMap = levelNineteenMapGeneration();
          playerXPosition = 8;
          playerYPosition = 4;
        }
        if(level == 20){
          levelOneMap = levelTwentyMapGeneration();
          playerXPosition = 0;
          playerYPosition = 0;
        }
        if(level == 21){
          levelOneMap = levelTwentyOneMapGeneration();
          playerXPosition = 2;
          playerYPosition = 0;
        }
        if(level == 22){
          levelOneMap = levelTwentyTwoMapGeneration();
          playerXPosition = 6;
          playerYPosition = 0;
        }
        if(level == 23){
          levelOneMap = levelTwentyThreeMapGeneration();
          playerXPosition = 1;
          playerYPosition = 3;
        }
        if(level == 24){
          levelOneMap = levelTwentyFourMapGeneration();
          playerXPosition = 2;
          playerYPosition = 1;
        }
        if(level == 25){
          levelOneMap = levelTwentyFiveMapGeneration();
          playerXPosition = 0;
          playerYPosition = 3;
        }
        if(level == 26){
          levelOneMap = levelTwentySixMapGeneration();
          playerXPosition = 4;
          playerYPosition = 3;
        }
        gemCount = 0;

        printing(levelOneMap, gemCount, totalGems, level);
          }
          else{
          if (levelOneMap[playerYPosition + 1][playerXPosition].equals(ANSI_GREEN + "██")) {
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition + 1][playerXPosition] = ANSI_RESET + "██";
            gemCount++;
            playerYPosition++;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          if(playerYPosition < levelOneMap.length - 1){
          if (levelOneMap[playerYPosition + 1][playerXPosition].equals(ANSI_YELLOW + "██")) {
            for(int i = 0; i < levelOneMap.length; i++){
              for(int j = 0; j < levelOneMap[0].length; j++){
                if(levelOneMap[i][j].equals(ANSI_PURPLE + "██")){
                  levelOneMap[i][j] = ANSI_GREEN + "██";
                }
              }
            }
            count = 2;
            System.out.println("\033[H\033[2J");
            System.out.flush();
            levelOneMap[playerYPosition][playerXPosition] = ANSI_BLUE + "██";
            levelOneMap[playerYPosition + 1][playerXPosition] = ANSI_RESET + "██";
            playerYPosition++;
            printing(levelOneMap, gemCount, totalGems, level);
          }
          }
          }

          
            


          

        }

      }

      if (gemCount == totalGems) {
        break;
      }

      count--;

    }
    System.out.print("All Gems Have Been Collected!\nPress [ENTER] to go to the next level.");
    levels++;
    String nextLevel = scan.nextLine();

  }

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    System.out.flush();
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
    System.out.flush();
    System.out.println(
        "In this game you can use the W,A,S,D keys to choose where you want to move and you can use the key [R] to reset the map. (but renember to click [ENTER] after each input)");

    System.out.println("\nPress [ENTER] to start");
    System.out.println("\nPress [C] + [ENTER] to choose a level");

    String start = scan.nextLine();

    if(start.equals("c")){
      System.out.println("\033[H\033[2J");
      System.out.flush();
      System.out.println("Type a level from 1 - 26");

      while(true){
      

      try{
        levels = scan.nextInt();
        
      }
      catch(Exception e){
        System.out.println("has to be a number");
      }
      scan.nextLine();
      if(levels <= 26 && levels > 0){
        break;
      }
      else{
        System.out.println("Invalid level");
      }
      }
      System.out.println("\033[H\033[2J");
        System.out.flush();
      if(levels == 1){
        playLevel(levelOneMapGeneration(), 0, 0, 1, 1);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }

      if(levels == 2){
        playLevel(levelTwoMapGeneration(), 0, 2, 1, 2);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 3){
        playLevel(levelThreeMapGeneration(), 3, 4, 3, 3);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 4){
        playLevel(levelFourMapGeneration(), 0, 2, 1, 4);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 5){
        playLevel(levelFiveMapGeneration(), 7, 1, 3, 5);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 6){
        playLevel(levelSixMapGeneration(), 4, 2, 5, 6);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 7){
        playLevel(levelSevenMapGeneration(), 1, 0, 1, 7);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 8){
        playLevel(levelEightMapGeneration(), 0, 2, 3, 8);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 9){
        playLevel(levelNineMapGeneration(), 1, 2, 3, 9);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 10){
        playLevel(levelTenMapGeneration(), 1, 4, 3, 10);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 11){
        playLevel(levelElevenMapGeneration(), 0, 1, 4, 11);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 12){
        playLevel(levelTwelveMapGeneration(), 2, 0, 4, 12);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 13){
        playLevel(levelThirteenMapGeneration(), 0, 4, 3, 13);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 14){
        playLevel(levelFourteenMapGeneration(), 2, 2, 4, 14);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }
      if(levels == 15){
        playLevel(levelFifthteenMapGeneration(), 3, 3, 5, 15);
    System.out.println("\033[H\033[2J");
    System.out.flush();
      }

      if(levels == 16){
        playLevel(levelSixteenthMapGeneration(), 0, 5, 4, 16);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 17){
        playLevel(levelSeventeenMapGeneration(), 2, 0, 6, 17);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 18){
            playLevel(levelEighteenMapGeneration(), 5, 3, 4, 18);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }

      if(levels == 19){
          playLevel(levelNineteenMapGeneration(), 8, 4, 4, 19);
    System.out.println("\033[H\033[2J");
    System.out.flush();
        }

      if(levels == 20){
        playLevel(levelTwentyMapGeneration(), 0, 0, 1, 20);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 21){
        playLevel(levelTwentyOneMapGeneration(), 2, 0, 3, 21);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 22){
        playLevel(levelTwentyTwoMapGeneration(), 6, 0, 7, 22);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 23){
        playLevel(levelTwentyThreeMapGeneration(), 1, 3, 3, 23);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 24){
        playLevel(levelTwentyFourMapGeneration(), 2, 1, 10, 24);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }
      if(levels == 25){
          playLevel(levelTwentyFiveMapGeneration(), 0, 3, 9, 25);
        System.out.println("\033[H\033[2J");
        System.out.flush();

        }
      if(levels == 26){
        playLevel(levelTwentySixMapGeneration(), 4, 3, 6, 26);
        System.out.println("\033[H\033[2J");
        System.out.flush();
      }

    }

    else{
    System.out.println("\033[H\033[2J");
    System.out.flush();

    // Map, x, y, gems, level
    playLevel(levelOneMapGeneration(), 0, 0, 1, 1);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelTwoMapGeneration(), 0, 2, 1, 2);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelThreeMapGeneration(), 3, 4, 3, 3);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelFourMapGeneration(), 0, 2, 1, 4);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelFiveMapGeneration(), 7, 1, 3, 5);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelSixMapGeneration(), 4, 2, 5, 6);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelSevenMapGeneration(), 1, 0, 1, 7);
        System.out.println("\033[H\033[2J");
        System.out.flush();

    playLevel(levelEightMapGeneration(), 0, 2, 3, 8);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelNineMapGeneration(), 1, 2, 3, 9);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelTenMapGeneration(), 1, 4, 3, 10);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelElevenMapGeneration(), 0, 1, 4, 11);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelTwelveMapGeneration(), 2, 0, 4, 12);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelThirteenMapGeneration(), 0, 4, 3, 13);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelFourteenMapGeneration(), 2, 2, 4, 14);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelFifthteenMapGeneration(), 3, 3, 5, 15);
    System.out.println("\033[H\033[2J");
    System.out.flush();
    playLevel(levelSixteenthMapGeneration(), 0, 5, 4, 16);
    System.out.println("\033[H\033[2J");
    System.out.flush();
    playLevel(levelSeventeenMapGeneration(), 2, 0, 6, 17);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelEighteenMapGeneration(), 5, 3, 4, 18);
    System.out.println("\033[H\033[2J");
    System.out.flush();
    playLevel(levelNineteenMapGeneration(), 8, 4, 4, 19);
    System.out.println("\033[H\033[2J");
    System.out.flush();
    playLevel(levelTwentyMapGeneration(), 0, 0, 1, 20);
    System.out.println("\033[H\033[2J");
    System.out.flush();

    playLevel(levelTwentyOneMapGeneration(), 2, 0, 3, 21);
        System.out.println("\033[H\033[2J");
        System.out.flush();
    
    playLevel(levelTwentyTwoMapGeneration(), 6, 0, 7, 22);
        System.out.println("\033[H\033[2J");
        System.out.flush();

    playLevel(levelTwentyThreeMapGeneration(), 1, 3, 3, 23);
        System.out.println("\033[H\033[2J");
        System.out.flush();
    playLevel(levelTwentyFourMapGeneration(), 2, 1, 10, 24);
        System.out.println("\033[H\033[2J");
        System.out.flush();

    playLevel(levelTwentyFiveMapGeneration(), 0, 3, 9, 25);
        System.out.println("\033[H\033[2J");
        System.out.flush();

    playLevel(levelTwentySixMapGeneration(), 4, 3, 6, 26);
        System.out.println("\033[H\033[2J");
        System.out.flush();

    }

    

    System.out.println("    __________________________________________________________________");
    System.out.println("      __                             __                           ");
    System.out.println("    /    )   ,       /             /    )          ,              ");
    System.out.println("----\\------------__-/----__--------\\---------------------__----__-");
    System.out.println("     \\     /   /   /   /___)        \\    | /| /  /     /   ) /___)");
    System.out.println("_(____/___/___(___/___(___ _____(____/___|/_|/__/_____/___/_(___ _");
    System.out.println("                                                     /            ");
    System.out.println("                                                    ");

    System.out.println("\nCongradulations You Hve Beat Side Swipe!");

    System.out.println("\nEvery like = 1 new level");

  }
}

// ▓
// █