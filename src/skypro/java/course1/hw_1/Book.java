package skypro.java.course1.hw_1;

import java.util.Objects;

public class Book {  // класс Книга
    private final String title;
    private final Author author;  // объект Автор
    private int yearOfPublication;


    public Book(String title, Author author, int yearOfPublication) {  // конструктор
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

    // переопределение методов
    // выберем для сравнения название и автора книги, т.к. год публикации можеть быть различный, но сами книги одинаковые
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Название книги: " + title + "; " + author.toString() + "; год публикации " + yearOfPublication + ".";
    }
}
