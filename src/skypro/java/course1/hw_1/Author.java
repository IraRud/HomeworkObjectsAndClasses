package skypro.java.course1.hw_1;

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
}
