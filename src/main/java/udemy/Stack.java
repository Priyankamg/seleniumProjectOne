package udemy;

/**
 * Created by prinks on 11/11/17.
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top = -1;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public boolean isFull() {
        return (top==maxSize-1);
    }

    public void push(int element) throws ArrayIndexOutOfBoundsException{
        if(!isFull()) {
            top++;
            stackArray[top] = element;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack array is full");
        }
    }

    public int pop() throws ArrayIndexOutOfBoundsException{
        if(!isEmpty()) {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack Array is empty");
        }
    }

    public int peek() throws ArrayIndexOutOfBoundsException {
        if(!isEmpty()) {
            return stackArray[top];
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack Array is empty");
        }
    }
}
