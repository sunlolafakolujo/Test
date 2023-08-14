package innerclass.classinsideinterface;

import java.time.LocalDate;

public interface LibraryService {
    void issueBook(Book book);

    void returnBook(Book book);

    class Book {
        private int bookId;
        private String bookName;
        private String authorName;
        private String shelfLocation;
        private String bookSerialNumber;
        private LocalDate issuedDate;
        private LocalDate returnDate;

        public Book() {
        }

        public Book(int bookId, String bookName, String authorName,
                    String bookLocation, String bookSerialNumber,
                    LocalDate issuedDate, LocalDate returnDate) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.authorName = authorName;
            this.shelfLocation = bookLocation;
            this.bookSerialNumber = bookSerialNumber;
            this.issuedDate = issuedDate;
            this.returnDate = returnDate;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bookId=" + bookId +
                    ", bookName='" + bookName + '\'' +
                    ", authorName='" + authorName + '\'' +
                    ", bookLocation='" + shelfLocation + '\'' +
                    ", bookSerialNumber='" + bookSerialNumber + '\'' +
                    ", issuedDate=" + issuedDate +
                    ", returnDate=" + returnDate +
                    '}';
        }
    }
}
