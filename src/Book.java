public class Book {
    private final String titulName;
    private int datePublish;


    public Book(String titulName, int datePublish ) {
        this.titulName = titulName;
        this.datePublish = datePublish;
    }

    public String getTitulName() {
        return titulName;
    }

    public int getDatePublish() {
        return datePublish;
    }
    public void setDatePublish(int datePublish) {
        this.datePublish = datePublish;
    }

    Author author;

}
