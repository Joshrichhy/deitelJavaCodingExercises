package ArrayListTest;

import ArrayList.ArrayLists;
import Lists.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

       Lists myArrayList;

        @BeforeEach
        public void startEachTestWith() {
            myArrayList = new ArrayLists();
        }


        @Test
        public void arrayListCanBeCreatedTest() {
            assertNotNull(myArrayList);
        }

    @Test
    public void newArrayListIsEmptyTest() {
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addElement_ArrayListShouldNotBeEmptyTest() {
        //when
        myArrayList.add(34);
        //assert
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void addXRemoveX_ArrayListShouldBeEmpty() {
        //when
        myArrayList.add(34);
        myArrayList.remove(34);
        myArrayList.output();
        //assert
        assertTrue(myArrayList.isEmpty());

    }
    @Test
    public void addXAndY_removeY_arrayShouldNotBeEmpty() {
        //when
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.remove(99);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void removeFromEmptyArrayList_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(34));
    }
    @Test
    public void addOneElement_arrayListSizeIsOne() {
        myArrayList.add(34);
        assertEquals(1, myArrayList.size());
    }
    @Test
    public void addElement_arrayListSizeIncreases() {
        myArrayList.add(34);
        myArrayList.add(34);
        assertEquals(2, myArrayList.size());
    }
    @Test
    public void insertElementInArrayList() {
        myArrayList.add(34);
        myArrayList.add(94, 0);
        assertEquals(94, myArrayList.get(0));
        assertEquals(34, myArrayList.get(1));
        assertEquals(2, myArrayList.size());
    }
    @Test
    public void addThreeElement_getSecondByIndex() {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        assertEquals(32, myArrayList.get(1));
    }
    @Test
    public void getIndexOfElementTest() {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        assertEquals(1, myArrayList.getIndexOf(32));
    }
    @Test
    public void arrayListIsElasticTest() {
        assertEquals(3, myArrayList.getCapacity());
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        myArrayList.add(54);
        myArrayList.add(45);
        assertEquals(6, myArrayList.getCapacity());
        assertEquals(5, myArrayList.size());
        myArrayList.add(43);
        myArrayList.add(21);
        assertEquals(12, myArrayList.getCapacity());
        assertEquals(7, myArrayList.size());
    }

    @Test
    public void addXYZ_removeY_ZShouldBeInPositionOfY() {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        myArrayList.add(9);
        myArrayList.add(20);
        myArrayList.add(100,1);
       myArrayList.remove(32);
        myArrayList.output();
        assertEquals(99, myArrayList.get(2));
        System.out.println(myArrayList.size());
        assertEquals(5, myArrayList.size());
        assertEquals(0, myArrayList.get(2));
    }





}
