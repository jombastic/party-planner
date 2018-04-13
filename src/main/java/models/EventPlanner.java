package models;

public class EventPlanner {
  private int guests;
  private String drinkType;
  private String food;
  private String entertainment;

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

  private String location;


}
