package se2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class StringCalculatorTest {
    StringCalculator sc = new StringCalculator();

    @Test
    public void nullTest() {
        assertEquals(sc.Calculator(null), 0);
    }

    @Test
    public void singleNumberTest() {
        assertEquals(sc.Calculator("1"), 1);
    }

    @Test
    public void NumCommaNumSumTest() {
        assertEquals(sc.Calculator("2,5"), 7);
        assertEquals(sc.Calculator("9,1"), 10);
        assertEquals(sc.Calculator("0,3"), 3);
    }

    @Test
    public void NumNewLineNumSumTest() {
        assertEquals(sc.Calculator("4\n3"), 7);
        assertEquals(sc.Calculator("2\n2"), 4);
        assertEquals(sc.Calculator("4\n0"), 4);
    }

    @Test
    public void SumThreeNumbersTest() {
        assertEquals(sc.Calculator("1\n0,1"), 2);
        assertEquals(sc.Calculator("9,10\n11"), 30);
    }

    @Test
    public void OmmitGreaterThan1000Test() {
        assertEquals(sc.Calculator("1000\n9999,1"), 1001);
        assertEquals(sc.Calculator("2020,3000\n13"), 13);
    }

    @Test
    public void extraDelimiterTest() {
        assertEquals(sc.Calculator("//#3\n2#1"), 6);
        assertEquals(sc.Calculator("//?0?2?9"), 11);
    }
}