package stringcal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
  StringCalculator sc = new StringCalculator();

  @Test
  public void nullTest() {
    assertEquals(sc.calculator(null), 0);
  }

  @Test
  public void singleNumberTest() {
    assertEquals(sc.calculator("1"), 1);
  }

  @Test
  public void numCommaNumSumTest() {
    assertEquals(sc.calculator("2,5"), 7);
    assertEquals(sc.calculator("9,1"), 10);
    assertEquals(sc.calculator("0,3"), 3);
  }

  @Test
  public void numNewLineNumSumTest() {
    assertEquals(sc.calculator("4\n3"), 7);
    assertEquals(sc.calculator("2\n2"), 4);
    assertEquals(sc.calculator("4\n0"), 4);
  }

  @Test
  public void sumThreeNumbersTest() {
    assertEquals(sc.calculator("1\n0,1"), 2);
    assertEquals(sc.calculator("9,10\n11"), 30);
  }

  @Test
  public void ommitGreaterThan1000Test() {
    assertEquals(sc.calculator("1000\n9999,1"), 1001);
    assertEquals(sc.calculator("2020,3000\n13"), 13);
  }

  @Test
  public void extraDelimiterTest() {
    assertEquals(sc.calculator("//#3\n2#1"), 6);
    assertEquals(sc.calculator("//?0?2?9"), 11);
  }
}
