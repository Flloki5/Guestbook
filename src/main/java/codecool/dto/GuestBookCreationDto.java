package codecool.dto;

import codecool.model.GuestBook;

import java.util.ArrayList;
import java.util.List;

public class GuestBookCreationDto {
    private List<GuestBook> guestBooks;

    public GuestBookCreationDto(){
        this.guestBooks = new ArrayList<>();
    }

    public void addPost(GuestBook guestBook) {
        guestBooks.add(guestBook);
    }

    public List<GuestBook> getGuestBooks(){
        return guestBooks;
    }

    public void setGuestBooks(List<GuestBook> guestBooks) {
        this.guestBooks = guestBooks;
    }

}
