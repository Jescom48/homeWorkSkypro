public class App {

    public static void printAuthor(Author author) {
        System.out.println(author.getFirstName() + " " + author.getLastName());
    }

    public static void printBook(Book book) {
        System.out.println("Книга: " + book.getTitle() + ", автор: " + book.getAuthor() + ", год публикации: " + book.getYearPublication());
    }

    public static void main(String[] args) {

        Author dumas = new Author("Александр", "Дюма");
        printAuthor(dumas);
        Author defoe = new Author("Даниель", "Дефо");
        printAuthor(defoe);

        System.out.println();

        Book monte = new Book("Граф Монте-Кристо", dumas, 1844);
        printBook(monte);

        Book robinson = new Book("Робинзон Крузо", defoe, 1719);
        printBook(robinson);

        monte.setYearPublication(1846);
        printBook(monte);
    }
}
