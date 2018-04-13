package models;

public class EventPlanner {
  private int guests;
  private String drinkType;
  private String[] drinks = {"non-alcohol", "alcohol", "full bar"};
  private String food;
  private String entertainment;
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
    for (int i = 0; i < drinks.length; i++) {
      if (drinkType.equals(drinks[i])) {
        return true;
      } else {
        this.drinkType = drinkType;
      }
    }
    System.out.println("Beverage type not recognised. Please enter from the following:" +
    String.join(", ", drinks));
    return false;
  }
}
