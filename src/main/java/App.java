import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.EventPlanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //String beverages;
    EventPlanner newPlan = new EventPlanner();
    System.out.println("Welcome to the ultimate party planer!");
    System.out.println("Select from our offers and enjoy the parties of a lifetime");
    boolean newParty;
    int guests = 0;
    do {
      while (guests <= 0) {
        System.out.println("\nEnter the number of guests you expect: ");
        String numberString = scanner.nextLine();
        while (!isNumber(numberString)) {
          System.out.println("Wrong input");
          numberString = scanner.nextLine();
        }
        guests = Integer.parseInt(numberString);
        newPlan.setGuests(guests);
      }

      System.out.println("Choose beverage preferences: non-alcohol, alcohol or full bar.");
      String beverages = scanner.nextLine();
      while (!newPlan.setDrinkType(beverages)) {
        beverages = scanner.nextLine();
      }

      System.out.println("Choose food preferences: French, Italian or traditional.");
      String food = scanner.nextLine();
      while (!newPlan.setFood(food)) {
        food = scanner.nextLine();
      }

      System.out.println("Choose entertainment preferences: DJ, local band or both.");
      String entertainment = scanner.nextLine();
      while (!newPlan.setEntertainment(entertainment)) {
        entertainment = scanner.nextLine();
      }

      System.out.println("Choose location: restaurant, ranch or hotel suite.");
      String location = scanner.nextLine();
      while (!newPlan.setLocation(location)) {
        location = scanner.nextLine();
      }

      System.out.println("Your receipt:");
      System.out.println("----------------------------");
      System.out.println(newPlan.getReceipt());
      System.out.println("----------------------------");
      System.out.println("The full cost for all parties is: " + newPlan.getFullCost());

      String anotherParty;
      do {
        System.out.println("\nPlan another party? Enter y or n");
        anotherParty = scanner.nextLine();
      } while ((!anotherParty.equalsIgnoreCase("y")) && (!anotherParty.equalsIgnoreCase("n")));

      if (anotherParty.equalsIgnoreCase("y")) {
        newParty = true;
      } else {
        newParty = false;
      }
    } while (newParty);
  }

  public static boolean isNumber(String numberString) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(numberString);
    return matcher.matches();
  }
}
