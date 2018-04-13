import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import models.EventPlanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //String beverages;
    EventPlanner newPlan = new EventPlanner(0,null, null,null,null);
    System.out.println("Welcome to the ultimate party planer!");
    System.out.println("Select from our offers and enjoy the parties of a lifetime");
    boolean chooseVenues = true;
    do {
      System.out.println("Enter the number of guests you expect: ");
      String numberString = scanner.nextLine();
      while (!isNumber(numberString)) {
        System.out.println("Wrong input");
        numberString = scanner.nextLine();
      }

      System.out.println("Choose beverage preferences: non-alcohol, alcohol or full bar.");
      String beverages = scanner.nextLine();
      while (!newPlan.setDrinkType(beverages)) {
        beverages = scanner.nextLine();
      }


    } while (chooseVenues);
  }

  public static boolean isNumber(String numberString) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(numberString);
    return matcher.matches();
  }
}
