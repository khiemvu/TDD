package TestStringCal;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/31/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {

    StringCalculator stringCalculator = new StringCalculator();
    @Test
     public void testEmptyString(){
        assertEquals(0, stringCalculator.cal(""));
    }
    @Test
    public void testWhenStringHaveANumber(){
        assertEquals(1, stringCalculator.cal("1"));
    }
    @Test
     public void testWhenStringHaveTwoNumber(){
        assertEquals(3, stringCalculator.cal("1,2"));
    }
    @Test
      public void testWhenStringHaveMultipliNumber(){
        assertEquals(6, stringCalculator.cal("1,2,3"));
    }
    @Test
    public void testWhenStringHaveNewLie(){
        assertEquals(3, stringCalculator.cal("1\n2"));
    }

}
