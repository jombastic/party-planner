package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
  /*@Test
  public void EventPlanner_instantiatesProperly() {
    EventPlanner testPlanner = new EventPlanner(10, "full bar", "italian", "dj", "hotel");
    assertEquals(true, testPlanner instanceof EventPlanner);
  }*/

  @Test
  public void setDrinkType_checkIfDrinkIsAnOption_true() {
    EventPlanner testPlanner = new EventPlanner();
    assertEquals(true, testPlanner.setDrinkType("alcohol"));
  }

  @Test
  public void setDrinkType_checkIfDrinkIsAnOption_false() {
    EventPlanner testPlanner = new EventPlanner();
    assertEquals(false, testPlanner.setDrinkType("booze"));
  }

  @Test
  public void setFood_checkIfFoodIsAnOption_true() {
    EventPlanner testPlanner = new EventPlanner();
    assertEquals(true, testPlanner.setFood("french"));
  }

  @Test
  public void setFood_checkIfFoodIsAnOption_false() {
    EventPlanner testPlanner = new EventPlanner();
    assertEquals(false, testPlanner.setFood("Macedonian"));
  }
}