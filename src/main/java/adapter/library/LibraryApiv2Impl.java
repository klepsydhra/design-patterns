package adapter.library;

import java.time.LocalDate;

public class LibraryApiv2Impl implements LibraryApiv2 {

    public int numberOfAvailableCopies(String bookTitle) {
        System.out.println("Checking availability of: " + bookTitle);
        return 3;
    }

    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Checking due date for: " + bookTitle);
        return LocalDate.now();
    }

    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Reserving: " + bookTitle);
        return true;
    }
}
