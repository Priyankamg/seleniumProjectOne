package udemy;

/**
 * Created by prinks on 11/11/17.
 */
public class Counter {
    private String name = null;
    private int count = 0;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        count++;
    }

    public int getCurrentValue() {
        return count;
    }

    public String toString() {
        return name + ":" + count;
    }
}
