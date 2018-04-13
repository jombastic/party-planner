package models;

public class EventPlanner {
  private int guests;
  private String drinkType;
  private String[] drinks = {"non-alcohol", "alcohol", "full bar"};
  private String food;
  private String[] foodTypes = {"French", "Italian", "Traditional"};
  private String entertainment;
  private String[] entertainmentTypes = {"DJ", "Local Band", "Both"};
  private String location;

  /*public EventPlanner(int guests, String drinkType, String food, String entertainment, String location) {
    this.guests = guests;
    this.drinkType = drinkType;
    this.food = food;
    this.entertainment = entertainment;
    this.location = location;
  }*/

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

  public void setGuests(int guests) {
    this.guests = guests;
  }

  public boolean setDrinkType(String drinkType) {
    for (String drink : drinks) {
      if (drinkType.equalsIgnoreCase(drink)) {
        return true;
      } else {
        this.drinkType = drinkType;
      }
    }
    System.out.println("Beverage type not recognised. Please enter from the following:" +
    String.join(", ", drinks));
    return false;
  }

  public boolean setFood(String food) {
    for (String foodType : foodTypes) {
      if (food.equalsIgnoreCase(foodType)) {
        return true;
      } else {
        this.food = food;
      }
    }
    System.out.println("Food type not recognised. Please enter from the following:" +
            String.join(", ", foodTypes));
    return false;
  }

  public boolean setEntertainment(String entertainment) {
    for (String entertainmentType : entertainmentTypes) {
      if (entertainment.equalsIgnoreCase(entertainmentType)) {
        return true;
      } else {
        this.entertainment = entertainment;
      }
    }
    System.out.println("Entertainment type not recognised. Please enter from the following:" +
            String.join(", ", entertainmentTypes));
    return false;
  }
}
