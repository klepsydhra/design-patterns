package adapter.library;

import adapter.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryApi {

    private LibraryApiv2 libraryApiv2;
    private User user;

    public APIAdapter(LibraryApiv2 libraryApiv2, User user) {
        this.libraryApiv2 = libraryApiv2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return libraryApiv2.numberOfAvailableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryApiv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryApiv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
