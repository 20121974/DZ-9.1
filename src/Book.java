public class Book {
    private final String titulName;
    private int datePublish;
    private String authorName;

    public Book(String titulName, int datePublish ) {
        this.titulName = titulName;
        this.datePublish = datePublish;
        this.authorName = authorName;
    }

    public String getTitulName() {

        return titulName;
    }
    public String getAuthorName() {

        return getAuthorName();
    }
    public int getDatePublish() {

        return datePublish;
    }
    public void setDatePublish(int datePublish) {

        this.datePublish = datePublish;
    }

    Author author;

}
