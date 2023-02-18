package Set;

import Lists.Lists;

public class Sets implements Lists {
    private int size;
private int[] element;
    private int Capacity;

    public Sets(int Capacity) {
        element = new int[Capacity];
        this.Capacity = Capacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int number) {
        setCapacity();
        for (int i  = 0; i < element.length; i++) {
            if (element[i] == number) throw new NumberFormatException("Element exist in set");

        element[size++] = number;}
    }

    @Override
    public void remove(int number) {
        if(isEmpty()) throw new IndexOutOfBoundsException("index out of bound");
        --size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int number, int index) {
        setCapacity();
        var temp = element[index];
        element[index] = number;
        element[size++] = temp;
    }

    @Override
    public int get(int index) {
        return element[index];
    }

    @Override
    public int getIndexOf(int number) {
        return 0;
    }

    @Override
    public int getCapacity() {
        return Capacity;
    }
    private void setCapacity(){
        if(size == Capacity) Capacity *= 2;
        element = new int [Capacity];
    }

    public boolean contains(int number) {
        for (int i  = 0; i < element.length; i++) {
            if (i == number) throw new NumberFormatException("Element exist in set");
            return true;
        }
        return false;
}

    @Override
    public void output() {

    }
}
