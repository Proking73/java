class Main {
    public static void main(String[] args) {
      long calcDAys = 4;
      String Message = calcDAys + " days are ";
      String total = Message + calcDAys * 24 * 60 * 60;
      System.out.println(total + " seconds.");
    }
  } 