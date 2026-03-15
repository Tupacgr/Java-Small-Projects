public class SecretAgentEvaluator {
  public static void main(String[] args) {
    String[] ar1 = {"  alPha  ", "beTa", "a", "  gAmma", "STOP", "oMecRoN"};
    final int MAX_ATTEMPTS = 3;
    int k = 0;
    System.out.println("Welcome to the \"Agency\".");
    System.out.println("Initializing system...");
    System.out.println();
    for (int i = 0; i < ar1.length; i++) {
      ar1[i] = ar1[i].trim().toUpperCase();
      if (ar1[i].equals("STOP")) {
        break;
      }
      if (ar1[i].length() >= 3) {
        k++;
      }
    }
    String[] ar2 = new String[k];
    int pos = -1;
    for (int i = 0; i < ar1.length; i++) {
      if (ar1[i].equals("STOP")) {
        break;
      }
      if (ar1[i].length() >= 3) {
        pos++;
        ar2[pos] = ar1[i];
      }
    }
    int s = 0;
    int suc = 0;
    for (int i = 0; i < ar2.length; i++) {
      s++;
      char fl = ar2[i].charAt(0);
      int uni = (int) fl;
      int ran = (int) (Math.random() * 100);
      byte score = (byte) ran;
      byte yp = (byte) (score % 3);
      String tier = "No Tier";
      switch (yp) {
        case 0:   
          tier = "Top Secret";
          break;
        case 1:
          tier = "Confidential";
          break;
        case 2:
            tier = "Restricted";
            break;
      }
      boolean flag = (score > 50) ? (true) : (false);
      if (flag) {
        suc++;
      }
      if (suc > MAX_ATTEMPTS) {
        break;
      } else {
        System.out.println("Processing " + ar2[i] + "... " + "Character 0 is " + fl + " (Unicode: " + uni +")." + " Score generated: " + score + ". " + "Tier: " + tier + ". " + "Passed: " + flag);
      }
    }
    System.out.println("Emergency STOP encountered. Halting agent processing.");
    System.out.println();
    for (int i = 1; i <= s; i++) {
      System.out.println("Attempt " + i + " logged.");
    }
    System.out.println("System shutdown.");
  }
}
