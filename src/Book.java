public class Book {
    private final String bookName;
    private final String authorName;
    private int publishingYear;


    public Book(String bookName, int publishingYear, String authorName) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public int setPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publisherYear) {
        this.publishingYear = publisherYear;
    }


}
