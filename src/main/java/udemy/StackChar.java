package udemy;

/**
 * Created by prinks on 11/11/17.
 */
public class StackChar {
    int maxSize;
    char[] charArr;
    int top = -1;

    public StackChar(int maxSize) {
        this.maxSize = maxSize;
        this.charArr = new char[maxSize];
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==maxSize-1;
    }

    public void push(char c) throws ArrayIndexOutOfBoundsException{
        if(!isFull()) {
            top++;
            charArr[top] = c;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
    }

    public char pop() throws ArrayIndexOutOfBoundsException {
        if(!isEmpty()) {
            int oldTop = top;
            top--;
            return charArr[oldTop];
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
    }
}
