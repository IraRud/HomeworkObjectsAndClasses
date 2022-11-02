package skypro.java.course1.hw_1;

public class Book {  // класс Книга
    private final String title;
    private final Author author;  // объект Автор
    private int yearOfPublication;


    public Book (String title, Author author, int yearOfPublication) {  // конструктор
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // геттеры
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    // сеттер
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
