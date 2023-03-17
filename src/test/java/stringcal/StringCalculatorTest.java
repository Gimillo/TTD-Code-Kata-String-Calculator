package stringcal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class for testing the calculator.
 * 
 * @author Jaime Gimillo Bonaque
*/
public class StringCalculatorTest {
    private StringCalculator sc = new StringCalculator();

    final int EXPECTED_2 = 2;
    final int EXPECTED_3 = 3;
    final int EXPECTED_4 = 4;
    final int EXPECTED_7 = 7;
    final int EXPECTED_10 = 10;
    final int EXPECTED_30 = 30;

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
        assertEquals(sc.calculator("2,5"), EXPECTED_7);
        assertEquals(sc.calculator("9,1"), EXPECTED_10);
        assertEquals(sc.calculator("0,3"), EXPECTED_3);
    }

    @Test
    public void numNewLineNumSumTest() {
        assertEquals(sc.calculator("4\n3"), EXPECTED_7);
        assertEquals(sc.calculator("2\n2"), EXPECTED_4);
        assertEquals(sc.calculator("4\n0"), EXPECTED_4);
    }

    @Test
    public void sumThreeNumbersTest() {
        assertEquals(sc.calculator("1\n0,1"), EXPECTED_2);
        assertEquals(sc.calculator("9,10\n11"), EXPECTED_30);
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
