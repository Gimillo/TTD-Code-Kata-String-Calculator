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

    private final int expected2 = 2;
    private final int expected3 = 3;
    private final int expected4 = 4;
    private final int expected7 = 7;
    private final int expected10 = 10;
    private final int expected30 = 30;

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
        assertEquals(sc.calculator("2,5"), expected7);
        assertEquals(sc.calculator("9,1"), expected10);
        assertEquals(sc.calculator("0,3"), expected3);
    }

    @Test
    public void numNewLineNumSumTest() {
        assertEquals(sc.calculator("4\n3"), expected7);
        assertEquals(sc.calculator("2\n2"), expected4);
        assertEquals(sc.calculator("4\n0"), expected4);
    }

    @Test
    public void sumThreeNumbersTest() {
        assertEquals(sc.calculator("1\n0,1"), expected2);
        assertEquals(sc.calculator("9,10\n11"), expected30);
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
