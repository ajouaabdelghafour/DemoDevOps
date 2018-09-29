import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    public void givenProperArgumentsWhenAddThenSomme() {

        int expected = 8;

        int actual = calculator.add(5,3);

        assertEquals(expected, actual);
    }
}