package adapter.library;

import java.time.LocalDate;

public class LibraryApiImpl implements LibraryApi {

    public boolean isAvailable(String bookTitle) {
        System.out.println("Checking availability of: " + bookTitle);
        return true;
    }

    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Checking due date for: " + bookTitle);
        return LocalDate.now();
    }

    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Reserving: " + bookTitle);
        return true;
    }
}
