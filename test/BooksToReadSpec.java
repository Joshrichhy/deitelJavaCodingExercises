import BooksToRead.BookShelf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BooksToReadSpec {
    @Test
    @DisplayName("is empty when no book is added to it")
    public void shelfEmptyWhenNoBookAdded() throws Exception {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();

        assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }
    @Test
    public void shelfToStringShouldPrintBookCountAndTitles() throws Exception {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books ();
        shelf.add("The Phoenix Project");
        shelf.add("Java 8 in action");
        String shelfStr = shelf.toString();
        assertAll( () ->
        assertTrue(shelfStr.contains("The Phoenix Project"), "1st book title missing"),
                () ->  assertTrue(shelfStr.contains("Java 8 in Action"), "2nd book title missing"),
                () -> assertTrue(shelfStr.contains("2 books found"), "book count  missing"));
    }

}
