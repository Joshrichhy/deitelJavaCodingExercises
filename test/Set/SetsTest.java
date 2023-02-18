package Set;

import Lists.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetsTest {
    Lists mySet;

    @BeforeEach
    public void startEachTestWith() {
        mySet = new Sets(3);
    }
    @Test
    public void SetCanBeCreatedTest() {
        assertNotNull(mySet);
    }

    @Test
    public void SetIsEmptyTest() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addElement_SetShouldNotBeEmptyTest() {
        mySet.add(34);
        assertFalse(mySet.isEmpty());
    }
    @Test
    public void addXRemoveX_SetShouldBeEmpty() {
        //when
        mySet.add(34);
        mySet.remove(34);
        //assert
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void addXAndY_removeY_SetNotBeEmpty() {
        //when
        mySet.add(34);
        mySet.add(99);
        mySet.remove(99);
        assertFalse( mySet.isEmpty());
    }
    @Test
    public void removeFromEmptySet_shouldThrowException() {
        assertThrows( IndexOutOfBoundsException.class, () -> mySet.remove(34));
    }
    @Test
    public void addOneElement_SetSizeIsOne() {
        mySet.add(34);
        assertEquals(1, mySet.size());
    }
    @Test
    public void addElement_arrayListSizeIncreases() {
        mySet.add(34);
        mySet.add(3);
        assertEquals(2, mySet.size());
    }
    @Test
    public void insertElementInSet() {
        mySet.add(34);
        mySet.add(94, 0);
        assertEquals(94, mySet.get(0));
        assertEquals(34, mySet.get(1));
        assertEquals(2, mySet.size());
    }

    @Test
    public void addThreeElement_getSecondByIndex() {
        mySet.add(34);
        mySet.add(32);
        mySet.add(99);
        assertEquals(32, mySet.get(1));
    }
    @Test
    public void addThreeElement_ensureElementsCantBeDuplicated() {
        mySet.add(34);
        assertThrows(NumberFormatException.class, ()->  mySet.add(34));
    }
    @Test
    public void TestSetContainsElement() {
        mySet.add(34);
        mySet.add(32);
        assertTrue( mySet.contains(34));
    }
    @Test
    public void arrayListIsElasticTest() {
        assertEquals(3, mySet.getCapacity());
        mySet.add(34);
        mySet.add(34);
        mySet.add(34);
        System.out.println(mySet.size());
        mySet.add(54);
        mySet.add(45);
        assertEquals(6, mySet.getCapacity());
        assertEquals(5, mySet.size());
        mySet.add(43);
        mySet.add(21);
        assertEquals(12, mySet.getCapacity());
        assertEquals(7, mySet.size());
    }

}