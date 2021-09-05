package Test;

import org.testng.annotations.Test;


public class TestNG {
  @Test
  public void testngexamplee() {
	  TestSonar.sonarqube.main("demo");
	  System.out.println("test is called");
  }
}
