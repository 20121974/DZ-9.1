public class Main {

    //public static Person createPerson(String name, int age) {
    //    Person person = new Person();
      //  person.name = name;
        //person.are = age;
        //return person;
  // }
    public static void main(String[] args) {
        Book book = new Book("Левиафан", 100);
        Author author = new Author("Б. Акунин");
        System.out.println(book.getBookName() + " " + book.setPublishingYear() + " " + author.getAuthorName());
    }
}
