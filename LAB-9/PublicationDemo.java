class Book {

    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    String getAuthorName() {
        return author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {

    private String title;

    BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    void display() {

        System.out.println("Book Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {

    private String title;

    PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    void display() {

        System.out.println("Paper Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

public class PublicationDemo {

    public static void main(String[] args) {

        Book ref;

        ref = new BookPublication(
            "Rich Dad Poor Dad",
            "Robert Toru Kiyosaki"
        );

        ref.display();

        ref = new PaperPublication(
            "Popatlal",
            "Golden Crow"
        );

        ref.display();
    }
}
