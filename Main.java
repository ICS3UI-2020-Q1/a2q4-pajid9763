import java.util.Scanner;
/**
 * program to find store discounts
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user how much they spent
  System.out.println("Please enter the amount the customer spent");
  double num = input.nextInt();

  // find their discount
  if (num > 0.01 && num <= 40.00){
    System.out.println("They will receive 10% off.");
    double save1 = num * 0.1;
    System.out.println("They will save $" + save1 + ".");
    double total1 = num - save1;
    System.out.println("The new total is $" + total1 + ".");
  
  }else if (num > 40.01 && num <= 80.00){
    System.out.println("They will receive 20% off.");
    double save2 = num * 0.2;
    System.out.println("They will save $" + save2 + ".");
    double total2 = num - save2;
    System.out.println("The new total is $" + total2 + ".");
  
  }else if (num > 80.01 && num <= 120.00){
    System.out.println("They will receive 30% off.");
    double save3 = num * 0.3;
    System.out.println("They will save $" + save3 + ".");
    double total3 = num - save3;
    System.out.println("The new total is $" + total3 + ".");
  
  }else if (num > 120.00){
    System.out.println("They will receive 40% off.");
    double save4 = num * 0.4;
    System.out.println("They will save $" + save4 + ".");
    double total4 = num - save4;
    System.out.println("The new total is $" + total4 + ".");
  }

    
  }
}
