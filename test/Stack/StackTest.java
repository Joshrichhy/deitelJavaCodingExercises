package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack myStack;

    @BeforeEach
    void setUp() {
        myStack = new Stack(5);
    }
    @Test
    public void TestThatStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void TestThatStackIsNotEmptyWhenIPush(){
        myStack.push(5);
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void TestThatStackIsEmptyWhenIPop(){
        myStack.push(5);
        myStack.pop(5);
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void TestThatICanGetXWhenIPopX(){
        myStack.push(5);
        assertEquals(5,  myStack.pop(5));
    }
    @Test
    public void TestThatICanGetX_YWhenIPopY_X(){
        myStack.push(5);
        myStack.push(25);
        assertEquals(25,  myStack.pop(25));
        assertEquals(5,  myStack.pop(5));
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void TestThatStackIsUnderFlowWhenIPopOutOfMyStack(){
        assertThrows(IllegalArgumentException.class, ()-> myStack.pop(25));
    }
    @Test
    public void TestThatStackCanBeFull(){
        myStack.push(5);
        myStack.push(25);
        myStack.push(45);
        myStack.push(55);
        myStack.push(45);
        assertTrue( myStack.isFull());
        assertThrows(StackOverflowError.class, ()-> myStack.push(95));

}
    @Test
    public void TestThatStackCanPeekl(){
        myStack.push(5);
        myStack.push(25);
        myStack.push(45);
        myStack.pop(45);
        assertEquals(25, myStack.peek());
}
}