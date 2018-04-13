package models;

public class EventPlanner {
  private int fullCost;
  private int eventCost;
  private int guests;
  private String drinkType;
  private String[] drinks = {"non-alcohol", "alcohol", "full bar"};
  private int[] drinkCosts = {5, 10, 20};
  private String food;
  private String[] foodTypes = {"French", "Italian", "Traditional"};
  private int[] foodCosts = {20, 25, 30};
  private String entertainment;
  private String[] entertainmentTypes = {"DJ", "Local Band", "Both"};
  private int[] entertainmentCosts = {10, 50, 60};
  private String location;
  private String[] locationTypes = {"Restaurant", "Ranch", "Hotel suite"};
  private int[] locationCosts = {100, 70, 90};

  public EventPlanner(int guests, String drinkType, String food, String entertainment, String location) {
    this.guests = guests;
    this.drinkType = drinkType;
    this.food = food;
    this.entertainment = entertainment;
    this.location = location;
  }

  public int getGuests() {
    return guests;
  }

  public String getDrinkType() {
    return drinkType;
  }

  public String getFood() {
    return food;
  }

  public String getEntertainment() {
    return entertainment;
  }

  public String getLocation() {
    return location;
  }

  public int getEventCost() {
    return this.eventCost;
  }

  public void setGuests(int guests) {
    this.guests = guests;
  }

  public boolean setDrinkType(String drinkType) {
    for (int i = 0; i < drinks.length; i++) {
      if (drinkType.equalsIgnoreCase(drinks[i])) {
        this.eventCost += guests * drinkCosts[i];
        this.drinkType = drinkType;
        return true;
      }
    }
    System.out.println("Beverage type not recognised. Please enter from the following: " +
            String.join(", ", drinks));
    return false;
  }

  public boolean setFood(String food) {
    for (int i = 0; i < foodTypes.length; i++) {
      if (food.equalsIgnoreCase(foodTypes[i])) {
        this.eventCost += guests * foodCosts[i];
        this.food = food;
        return true;
      }
    }
    System.out.println("Food type not recognised. Please enter from the following: " +
            String.join(", ", foodTypes));
    return false;
  }

  public boolean setEntertainment(String entertainment) {
    for (int i = 0; i < entertainmentTypes.length; i++) {
      if (entertainment.equalsIgnoreCase(entertainmentTypes[i])) {
        this.eventCost += entertainmentCosts[i];
        this.entertainment = entertainment;
        return true;
      }
    }
    System.out.println("Entertainment type not recognised. Please enter from the following: " +
            String.join(", ", entertainmentTypes));
    return false;
  }

  public boolean setLocation(String location) {
    for (int i = 0; i < locationTypes.length; i++) {
      if (location.equalsIgnoreCase(locationTypes[i])) {
        this.eventCost += locationCosts[i];
        this.location = location;
        return true;
      }
    }
    System.out.println("Location type not recognised. Please enter from the following: " +
            String.join(", ", locationTypes));
    return false;
  }

  public String getReceipt() {
    return String.format("Guests: %d\nDrinks: %s\nFood: %s\nEntertainment: %s\nLocation: %s\nCost of event: %d",
            this.guests, this.drinkType, this.food, this.entertainment, this.location, this.eventCost);
  }

  public int getFullCost() {
    return fullCost += eventCost;
  }
}
