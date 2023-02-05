package MyDiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    Diary myDiary;

    @BeforeEach
    void setUp(){
        myDiary = new Diary();
        myDiary.createEntry("Josh", " ");
    }


    @Test
    public void testThatMyDiaryHasEntry(){


        assertEquals(1, myDiary.getPagesInDiary());

    }
    @Test
    public void testThatMyDiaryHasEntryAtAParticularPage(){
        Entry expected = myDiary.findEntryInDiary(1);
        assertNotNull(expected.toString());

    }

    @Test
    public void testThatICanWriteIntoMyDiaryDiary(){
        myDiary.writeIntoDiary(1, "Josh", "It was a great Day");


        String expectedString = """
                        Entry Title: Josh
                        Entry Body: It was a great Day
                        """;
        assertEquals(expectedString, myDiary.findEntryInDiary(1).toString());
        System.out.println(myDiary.findEntryInDiary(1).toString());
    }

    @Test
    public void testThatICanEditMyDiary(){
        myDiary.writeIntoDiary(1, "Josh", "It was a great Day");
        myDiary.editOrAddingIntoEntry(1, "Josh Latest Edition", "I am better now");
        String expectededition = """
                        Entry Title: Josh Latest Edition
                        Entry Body: I am better now
                        """;
        assertEquals(expectededition, myDiary.findEntryInDiary(1).toString());
    }
    @Test
    public void testThatICanCountMyEntry(){
        myDiary.countEntries();
        assertEquals(1, myDiary.countEntries());
    }

    @Test
    public void testThatIcanViewMyEntry(){
        System.out.println(myDiary.viewEntry(1));
    }

    @Test
    public void testThatIcanDeleteMyEntry(){
        myDiary.createEntry("Idan", " j");
        myDiary.createEntry("Olayinka", " Josh");
        myDiary.createEntry("Yinka", " ");
        myDiary.createEntry("Yinkaooo", "jide");
        myDiary.deleteEntry(2);
       //
        // System.out.println(myDiary.viewEntry(2));
        assertEquals(4, myDiary.countEntries());


    }





}