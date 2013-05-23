package StackTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/22/13
 * Time: 9:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    MyStack test = new MyStack();
    @Test
    public void testNewStackIsEmpty(){
       assertEquals(0, test.size());
       assertTrue(test.isEmpty());

    }
    @Test
    public void testPushToEmptyStack(){
        int size = 5;
        for(int i = 0; i < size; i++)
            test.push("test");
        assertEquals(size, test.size());
        assertFalse(test.isEmpty());
    }
    @Test
    public void testPushFurtherPop() throws StackEmptyException {
        String mes = "temp";
        test.push(mes);
        assertFalse(test.isEmpty());
        assertEquals(test.pop(), "temp");
        assertTrue(test.isEmpty());
        assertEquals(0, test.size());
    }
    @Test
    public void testPopStackEmpty(){
        assertEquals(true, test.isEmpty());
        try {
            assertEquals(null, test.pop());
        } catch (StackEmptyException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
    @Test
    public void testPopItemOrderInStack(){
        String message = "test";
        for (int i = 0; i <= 10; i++){
            test.push(message + i);
        }
        for (int i = 10 ; i >= 0; i--){
            try {
                assertEquals("test"+i, test.pop());
            } catch (StackEmptyException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
    @Test
    public void testStackIsFull() throws StackEmptyException {
        try{
        for(int i = 1; i <= 101; i++)
            test.push("test"+i);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    @Test
    public void testValueOnTopStack(){
        for (int i = 1; i < 5; i++){
            test.push("test"+i);
        }
        try {
            assertEquals("test4", test.top());
        } catch (StackEmptyException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
