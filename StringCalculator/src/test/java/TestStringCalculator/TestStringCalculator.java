package TestStringCalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/30/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {
    @Test
    public void returnZeroWhenStringIsEmpty(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.cal(""));
    }
    @Test
    public void returnThisNumberWhenStringHaveANumber(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.cal("1"));
    }
    @Test
    public void returnSumWhenStringHaveTwoNumber(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.cal("1,2"));
    }
    @Test
    public void returnSumWhenStringHaveMultipliNumber(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.cal("1,2,3"));
    }
    @Test
    public void newLineDelimiterShouldBeHandle(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.cal("1\n2"));
    }
    @Test
    public void userDifineDelimiter(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.cal("//;\n1;2"));
    }
    @Test
    public void userDefineKeywordDelimiter(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.cal("//?\n1?2"));
    }
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void returnExceptionWhenStringHaveANegativeNumber(){
        StringCalculator stringCalculator = new StringCalculator();
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("negative not allowed -1");
        stringCalculator.cal("-1");

    }
    @Test
    public void returnExceptionWithAllMultipleNegativeNumberWhenStringHaveMultipleNegativeNumber(){
        StringCalculator stringCalculator = new StringCalculator();
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("negative not allowed -1 -5");
        stringCalculator.cal("-1,4,-5");
    }
    @Test
    public void WhenStringHaveNumberLargeThan1000ShouldIgnore(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(2, stringCalculator.cal("1001,2"));
    }

}
