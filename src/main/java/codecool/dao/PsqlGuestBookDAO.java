package codecool.dao;

import codecool.model.GuestBook;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PsqlGuestBookDAO implements GuestBookDAO {

    private static final List<GuestBook> guestBookList = Stream.of(new GuestBook(1, "Flloki", "FirstMessage", "10.10.2019 20:11:10"),
            new GuestBook(2, "Guest12312", "Hello World", "10.11.2019 05:15:46"),
            new GuestBook(3, "TheRed", "(^^,))", "17.11.2019 15:17:10")).collect(Collectors.toList());

    @Override
    public List<GuestBook> getGuestBookList() {
        return guestBookList;
    }

    @Override
    public void addGuestBook(GuestBook guestBook) {
        guestBookList.add(guestBook);
    }
}
