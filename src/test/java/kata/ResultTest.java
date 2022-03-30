package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.internal.matchers.text.ValuePrinter.print;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result result1 = new Result(37);
        Assertions.assertEquals(result1.number,"00");
    }

    @Test
    public void theResultIsAlwaysBetween00and36() throws Exception {
        for (int i = 0; i < 37; i++) {
            Result result = new Result(i);
            assertNumberResult(i, result.number);
        }
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        Result result1 = new Result(0);
        Result result2 = new Result(00);
        Assertions.assertEquals(result1.color, Result.Color.GREEN);
        Assertions.assertEquals(result2.color, Result.Color.GREEN);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        Result result1 = new Result(2);
        Result result2 = new Result(3);
        Assertions.assertEquals(result1.color, Result.Color.BLACK);
        Assertions.assertNotEquals(result2.color, Result.Color.BLACK);
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        Result result1 = new Result(1);
        Result result2 = new Result(2);
        Assertions.assertEquals(result1.color, Result.Color.RED);
        Assertions.assertNotEquals(result2.color, Result.Color.RED);
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {
        try {
            Result result = new Result(40);
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Result can't be 40");
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {
        try {
            Result result = new Result(-1);
        } catch (Exception e) {
            Assertions.assertEquals(e.getMessage(), "Result can't be -1");
        }

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {
        Assertions.assertEquals(new Result(randomizerValue).color, expectedColor);
    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
        Assertions.assertEquals(new Result(randomizerValue).number, expectedNumber);
    }
}