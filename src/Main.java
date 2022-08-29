public class Main {

    //public static Person createPerson(String name, int age) {
    //    Person person = new Person();
      //  person.name = name;
        //person.are = age;
        //return person;
  // }
    public static void main(String[] args) {
        Book book = new Book("Левиафан", 100, "А.Пушкин");
        System.out.println(book.getAuthorName() + " " + book.getBookName() + " " + book.setPublishingYear() + " страниц");
    }
}
