package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
  @Test
  public void EventPlanner_instantiatesProperly() {
    EventPlanner testPlanner = new EventPlanner(10, "full bar", "italian", "dj", "hotel");
    assertEquals(true, testPlanner instanceof EventPlanner);
  }

  @Test
  public void setDrinkType_checkIfDrinkIsAnOption_true() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(true, testPlanner.setDrinkType("alcohol"));
  }

  @Test
  public void setDrinkType_checkIfDrinkIsAnOption_false() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(false, testPlanner.setDrinkType("booze"));
  }

  @Test
  public void setFood_checkIfFoodIsAnOption_true() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(true, testPlanner.setFood("french"));
  }

  @Test
  public void setFood_checkIfFoodIsAnOption_false() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(false, testPlanner.setFood("Macedonian"));
  }

  @Test
  public void setEntertainment_checkIfEntertainmentIsIncluded_true() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(true, testPlanner.setEntertainment("DJ"));
  }

  @Test
  public void setEntertainment_checkIfEntertainmentIsIncluded_false() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(false, testPlanner.setEntertainment("metallica"));
  }

  @Test
  public void setLocation_checkForLocation_true() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(true, testPlanner.setLocation("ranch"));
  }

  @Test
  public void setLocation_checkIfFalseLocation_false() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(false, testPlanner.setLocation("moon"));
  }

  @Test
  public void getReceipt_getTheBillForTheEvent_String() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    String receipt = String.format("Guests: %d\nDrinks: %s\nFood: %s\nEntertainment: %s\nLocation: " +
                    "%s\nCost of event: %d", testPlanner.getGuests(), testPlanner.getDrinkType(),
            testPlanner.getFood(), testPlanner.getEntertainment(), testPlanner.getLocation(),
            testPlanner.getEventCost());
    assertEquals(receipt, testPlanner.getReceipt());
  }

  @Test
  public void getFullCost_getTheFullCost_int() {
    EventPlanner testPlanner = new EventPlanner(10, "alcohol", "traditional", "local band", "ranch");
    assertEquals(0, testPlanner.getFullCost());
  }
}