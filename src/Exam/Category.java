package Exam;

public class Category {
    private String name;
    private Book[] books;
    private boolean hasComputer;

    public Category(String name, Book[] books) {
        this.name = name;
        this.books = books;
        if (name.equals("технической литературы")) {
            this.hasComputer = true;
        } else {
            this.hasComputer = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public boolean isHasComputer() {
        return hasComputer;
    }

    public void setHasComputer(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

    @Override
    public String toString() {
        String info = "Информация отдела \n " +
                "Наименование: " + this.name + "\n" +
                "Наличие компьютера: " + (this.hasComputer ? "Да\n" : "Нет\n" +
                "---------------Книги-----------------\n");
        for (Book book :
                this.books) {
            info = info + book.toString() + "\n";
        }
        return info;
    }

    public void printAllBooks() {
        String info = "============Книги============\n";
        for (Book book :
                this.books) {
            info = info + book.toString() + "\n";
        }
        System.out.println(info);
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    public void addBook(Book book) {
        int length = this.books.length;

        Book[] newBooks = new Book[length + 1];

        for (int i = 0; i < length; i++) {
            newBooks[i] = this.books[i];
        }
        newBooks[length] = book;
        this.books = newBooks;
    }

    public void findByAuthor(String author) {
        String s = "";
        int count = 0;

        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                s = s + book.toString() + "\n";
                count++;
            }
        }

        String finalStr = String.format("У автора %s: %s книг \n %s", author, count, s);
        System.out.println(finalStr);
    }

    public void countOfBook() {
        System.out.println("В этом отделе " + this.books.length + " книг");
    }
}
