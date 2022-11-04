package skypro.java.course1.hw_1;

public class Task {  // класс Main
    public static void main(String[] args) {
        // 1 способ создания объекта Книга
        Book firstBook = new Book("Охота на овец", new Author("Харуки", "Мураками"), 2015);
        System.out.println(firstBook.toString());

        // 2 способ создания объекта Книга
        Author secondAuthor = new Author("Маркус", "Зусак");
        Book secondBook = new Book("Книжный вор", secondAuthor, 2007);
        System.out.println(secondBook.toString());

        secondBook.setYearOfPublication(2022); // изменим для второй книги год публикации
        System.out.printf("\nИсправленный год выпуска для второй книги: %d.", secondBook.getYearOfPublication());

    }
}
