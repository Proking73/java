import java.util.*;
import java.time.*;
import java.time.format.*;
//make option with if else or switch, if addition, subtract, divide, or multiply
class Calc {
  public static void main(String[] args) {
    //message
    String dash = "Make sure the following numbers are numbers, not letters, you may not put decimals.";
    System.out.println(dash);
    int dashLong = 0;
    do {
      System.out.print("-");
    } while (dashLong < dash.length());
    /*Scanner which = new Scanner (System.in);
    String properties = " \n A) Addition\n B) Subtraction\n C) Multiplication\n D) Division";
    System.out.println("Which property do you want to use?" + properties);
    String propval = which.nextLine();
    switch (propval) {
      case Asd:
        
        break;
    
      default:
        break;
    }
    /*input num1 
    Scanner Input1 = new Scanner (System.in);
    System.out.println("Number 1");
    int n1v2 = Input1.nextInt();
    //input num2
    Scanner Input2 = new Scanner (System.in);
    System.out.println("Number 2");
    int n2v2 = Input2.nextInt();
    //create object for method & add the parameters
    Calc add = new Calc();
    add.calc(n1v2, n2v2);*/


    //date 
    //LocalDate tad = LocalDate.of(1988, Month.APRIL, 1-10);
    LocalDate tad = LocalDate.now();
    DateTimeFormatter toReadTad = DateTimeFormatter.ofPattern("dd|MM|yyyy");
    String date = "You calculated this on " + tad.format(toReadTad) + ".\n";
    System.out.println(date);
  }

  
  public void calc(int num1, int num2) {
    int total = num1 + num2;
    System.out.println("------------ \n" + num1 + " + " + num2 +  " = " + total + "\n------------");
  }  
}