package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.transform.Result;

public class TestCalculator {
    private Calculator calculator;
    private int a;
    private int b;
    private int result;

    @Before
    public void initTest() {
        calculator = new Calculator();
        a = 10;
        b = 5;
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testAddition() {
        int expectedSumma = 15;
        int actualSumma = calculator.add(10, 5);
        Assert.assertEquals(actualSumma, expectedSumma);
    }
        @Test
        public void testSubtraction() {
            int expectedSumma = 10;
            int actualSumma = calculator.add(10,5);
            Assert.assertEquals(actualSumma,expectedSumma);
        }

    @Test
    public void testMultiplication() {
        int expectedSumma = 50;
        int actualSumma = calculator.add(10,5);
        Assert.assertEquals(actualSumma,expectedSumma);
    }
    @Test
    public void testDivition() {
        int expectedSumma = 3;
        int actualSumma = calculator.add(10, 5);
        Assert.assertEquals(actualSumma, expectedSumma);
    }
}

