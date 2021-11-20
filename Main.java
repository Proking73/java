public class Main {
  static void ThisMethod() {
    System.out.println("This is a CUSTOM METHOD! \n in a pre-defined method\n Methods are like function, used when called.");
  }
  static void addition(int first_int, int sec_int) {
    int AddTotal = first_int + sec_int;
    System.out.println("\n");
    System.out.println(first_int + " + " + sec_int + " = " + AddTotal);
    if (first_int + sec_int <= 20) {
      System.out.println("Bit to easy, don't you think?\n");
    } else {
      System.out.println("I get why you would use it.\n");
    }
  }
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
    //loops 
    System.out.println("\n While loop");
    int loop = 0;
    while (loop < 5) {
      System.out.println(loop);
      //increment
      loop++;
    }
    //or 
    System.out.println("\n While loop with do, being called after");
    int loop2 = 0;
    do {
      System.out.println(loop2);
      loop2++;
    }
    while(loop2 < 5);
    System.out.println("\n For loop doing the same thing");
    //   executed once;  condition ; executed till met condition
    for (int F_loop = 0; F_loop < 10; F_loop++) {
      if (F_loop == 6) {
        break;
        //stops when F_loop is  to 5
      }
      if (F_loop == 5) {
        continue;
        //skips 5
      }
      System.out.println(F_loop);
    }
    System.out.println("\n Arrays");
    //arrays
    int[] oneTOfive = {1, 2, 3, 4};
    for (int array : oneTOfive) {
      System.out.println(array);
    }
    //prints 1
    System.out.println(oneTOfive[0]);
    System.out.println("Down below says how many elements are stored in the array");
    System.out.println(oneTOfive.length);
    //double array
    System.out.println("\n Double arrays");
    int[][] addition = { {1, 2, 3, 4, 5}, {0, 1, 2, 3, 4} };
    int calculation = addition[1][1];
    System.out.println(calculation);
    //moth to a flame the weekend & swedish house mafia
    //method
    ThisMethod();
    addition(15, 5);
  }
}