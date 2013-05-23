package StackTest;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/22/13
 * Time: 9:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyStack implements Stack {
    private String[] stack = new String[100];
    private int index = 0;

    @Override
    public void push(String item) {
        //To change body of implemented methods use File | Settings | File Templates.
        stack [++index] = item;
    }

    @Override
    public String top() throws StackEmptyException {
        return stack[index];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        if (index == 0)
            return true;
        else
            return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String pop() throws StackEmptyException {
        return stack[index--];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int size() {
        return index;  //To change body of created methods use File | Settings | File Templates.
    }

    /*public static void main(String[] args) throws StackEmptyException {
        MyStack test = new MyStack();
        String message = "kaka";

            test.push(message);

        System.out.println(test.size());
        System.out.println(test.pop());
        System.out.println(test.size());
    }*/
}
