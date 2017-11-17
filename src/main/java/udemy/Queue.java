package udemy;

/**
 * Created by prinks on 11/11/17.
 */
public class Queue {
    int front = -1;
    int rear = -1;
    int maxSize;
    int[] queueArray;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
    }

    public boolean isEmpty() {
        return (front==-1 || front>rear) ? true: false;
    }

    public boolean isFull() {
        return (rear==maxSize-1);
    }

    public void insert(int element) {
        if(!isFull()) {
            if(isEmpty()) {
                front++;
            }
            rear++;
            queueArray[rear] = element;
        } else {
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        }
    }

    public int delete() {
        if(!isEmpty()) {
            int oldFront = front;
            front++;
            return queueArray[oldFront];
        } else {
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
    }

}
