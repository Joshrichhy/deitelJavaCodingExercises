package ArrayList;

import Lists.Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists implements Lists {

    private int Capacity=3;
     private int [] elements;
    private int count;

    public ArrayLists(){
        elements = new int[Capacity];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void add(int number) {
        elements[count++] = number;
        setNewCapacity();
       }


    @Override
    public void remove(int number) {
        int counter = 0;
        if(isEmpty()) throw new IllegalArgumentException("Index out of Bound");
        for (int index = 0; index < count; index++) {
            if(elements[index] == number){counter = index;}}
        int [] newArray = new int[count+1];
        System.arraycopy(elements, counter+1, newArray, 0, count-counter);
        System.arraycopy(newArray, 0,  elements, counter, count-counter);
        setNewCapacity();

        count--;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(int number, int index) {
        int [] newElement = new int[count+1];
        System.arraycopy(elements, index, newElement, 0, count-index);
        elements[index] = number;
        System.arraycopy(newElement, 0,  elements, index+1, count-index);
            count++;
            setNewCapacity();


    }


    @Override
    public int get(int index) {
        if (index <= count)
            return elements[index];
        else return 0;
    }

    @Override
    public int getIndexOf(int number) {
        for (int index = 0; index < count; index++) {
            if(elements[index] == number) return index;
        }
        return 0;
    }

    @Override
    public int getCapacity() {
         return Capacity;
    }
    private void setNewCapacity(){
        if (size() == getCapacity())
            Capacity = Capacity * 2;
        int [] newElement = new int[Capacity];
        System.arraycopy(elements, 0, newElement, 0, elements.length);
        elements = newElement;
        System.arraycopy(newElement, 0, elements, 0, count);
    }
    public void output(){
        for (int number: elements ) {
            System.out.println(number);}
    }
}