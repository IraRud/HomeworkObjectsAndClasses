package skypro.java.course1.hw_1;

import java.util.Objects;

public class Author {  // класс Автор
    private final String name;
    private final String surname;

    public Author(String name, String surname) {  // конструктор
        this.name = name;
        this.surname = surname;
    }

    // геттеры
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    // переопределение методов
    // имя и фамилия автора должны быть одинаковыми для сравнения
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "автор: " + name + " " + surname;
    }
}
