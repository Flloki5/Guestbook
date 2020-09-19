package codecool.dao;

import codecool.model.GuestBook;

import java.util.List;


public interface GuestBookDAO {

    public List<GuestBook> getGuestBookList();

    public void addGuestBook(GuestBook guestBook);
}
