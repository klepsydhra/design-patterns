package adapter.library;

import java.time.LocalDate;

public interface LibraryApi {

    boolean isAvailable(String bookTitle);

    LocalDate dueDate(String bookTitle, String pesel);

    boolean reserve(String bookTitle, String pesel);
}
