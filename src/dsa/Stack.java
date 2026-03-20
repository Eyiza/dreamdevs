package dsa;

public class Stack {
    private int count = 0;
    private String[] elements = new String[10];

    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    public void push(String element) {
        elements[count] = element;
        count++;
    }

    public String pop() {
        return elements[--count];
    }
}
