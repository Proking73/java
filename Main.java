class Main {
  public static void main(String[] args) {
    int calcDays = -1;
    String Message = calcDays + " days are ";
    String total = Message + calcDays * 24 * 60 * 60;
    String words = total + " seconds.";
    System.out.println(words);
    if (calcDays == 1) {
      System.out.println("Just 1?");
    } else if (calcDays == 0) {
      System.out.println("OK. You're dumb if you don't know 0 days are 0 seconds, duh.");
    } else if (calcDays != 1) {
      System.out.println("Alright, some basic calculations.");
    // } else if (calcDays < 0) {
    //   String words = "Just use the normal above 0 days and add a negative (-) symbol behind the seconds and days, seriously, what are you doing?";
    }
    switch (calcDays) {
      case 1: {
        //system print line re-define here move this up and make it so that default is too weird to count
      }
    }
  }
}