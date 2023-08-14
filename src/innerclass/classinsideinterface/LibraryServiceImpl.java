package innerclass.classinsideinterface;

import java.time.LocalDate;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public void issueBook(Book book) {
        System.out.println(book);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(book);
    }

    public static void main(String[] args) {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.issueBook(
                new LibraryService.Book(101, "Java how to program", "Kin Fashakin",
                        "A12", "SN0700087667", LocalDate.now(), LocalDate.now().plusWeeks(2))
        );
    }
}
