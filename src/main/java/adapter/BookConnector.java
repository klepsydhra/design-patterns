package adapter;

import adapter.library.LibraryApi;

import java.time.LocalDate;

public class BookConnector {

    private final User user;
    private final LibraryApi api;

    public BookConnector(User user, LibraryApi api) {
        this.user = user;
        this.api = api;
    }

    public boolean checkAvailability(String title) {
        return api.isAvailable(title);
    }

    public boolean reserve(String title, User user) {
        return api.reserve(title,user.getPESEL());
    }

    public LocalDate whenToReturn(String title, User user) {
        return api.dueDate(title,user.getPESEL());
    }
}
