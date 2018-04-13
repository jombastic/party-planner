package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
  @Test
  public void EventPlanner_instantiatesProperly() {
    EventPlanner testPlanner = new EventPlanner(10, "full bar", "italian", "dj", "hotel");
    assertEquals(true, testPlanner instanceof EventPlanner);
  }
}