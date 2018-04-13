package models;

public class EventPlanner {
  private int guests;
  private String drinkType;
  private String food;
  private String entertainment;
  private String location;

  public EventPlanner(int guests, String drinkType, String food, String entertainment, String location) {
    this.guests = guests;
    this.drinkType = drinkType;
    this.food = food;
    this.entertainment = entertainment;
    this.location = location;
  }
}
