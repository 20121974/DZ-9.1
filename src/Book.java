public class Book {
    private final String bookName;
    private int publishingYear;


    public Book(String bookName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return bookName;
    }

    public int setPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publisherYear) {
        this.publishingYear = publisherYear;
    }


}
