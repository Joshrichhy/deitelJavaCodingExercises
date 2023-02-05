package MyDiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry myEntry;

    @BeforeEach
    void setUp(){
        myEntry = new Entry("Josh", 1);

    }

    @Test
    public void testThatMyEntryHasATitle(){
    myEntry.setTitle("My First Day in SemiColon");
    assertEquals("My First Day in SemiColon", myEntry.getTitle());
    }

    @Test
    public void getIdOfEntry(){
        myEntry.setIDnumber(1);
        assertEquals(1, myEntry.getId());
    }

    @Test
    public void testThatIcanWriteIntoMyEntry(){

       myEntry.writeIntoMyEntry("It was a great Day");
       // assertEquals("It was a great Day", myEntry.getbody());
       // System.out.println(myEntry.dateOnEntry().toString());








}}