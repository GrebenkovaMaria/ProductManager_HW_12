package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book = new Book(1, "Онегин", 100, "Пушкин");

    @Test
    void shouldTrueWithMatchesAuthor() {
        assertTrue(book.matches("Пушкин"));
    }

    @Test
    void shouldReturnFalseWithAuthor() {
        assertFalse(book.matches("Толстой"));
    }

    @Test
    void shouldTrueWithMatchesName() {
        assertTrue(book.matches("Онегин"));
    }

    @Test
    void shouldReturnFalseWithName() {
        assertFalse(book.matches("Другое"));
    }
}