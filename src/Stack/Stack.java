package Stack;

public class Stack {
     private int count;
    private int[] element;

    public Stack(int StackSize) {
        this.element = new int[StackSize];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(int number) {
        if(isFull()) throw new StackOverflowError("Stack Overflow");
        element[count++] = number;
    }

    public int pop(int number) {
        if(isEmpty()) throw new IllegalArgumentException("Stack Underflow");
        return element[--count];
    }

    public boolean isFull() {
        return count == element.length;
    }

    public int peek() {
        return element[count-1];
    }
}
