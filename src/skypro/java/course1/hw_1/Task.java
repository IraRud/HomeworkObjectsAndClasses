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

        // сравним первую и вторую книгу (ожидаемый результат: false)
        boolean comparisonOfFirstAndSecondBooks = compareBooks(firstBook, secondBook);
        System.out.println("Первая и вторая книги одинаковые - " + comparisonOfFirstAndSecondBooks);

        secondBook.setYearOfPublication(2022); // изменим для второй книги год публикации
        System.out.printf("Исправленный год выпуска для второй книги: %d.\n", secondBook.getYearOfPublication());

        // создадим новую книгу, отличную от второй только годом выпуска, и сравним (ожидаемый результат: true)
        Book thirdBook = new Book("Книжный вор", new Author("Маркус", "Зусак"), 2000);
        System.out.println(thirdBook.toString());
        boolean comparisonOfSecondAndThirdBooks = compareBooks(secondBook, thirdBook);
        System.out.println("Вторая и третья книги одинаковые - " + comparisonOfSecondAndThirdBooks);
    }

    public static boolean compareBooks(Book OneBook, Book TwoBook) {  // метод для сравнения книг
        return OneBook.equals(TwoBook);
    }

}
