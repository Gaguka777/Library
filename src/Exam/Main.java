package Exam;

public class Main {
    public static void main(String[] args) {


        Book[] books1= {

                new Book(1, "Сталин", "Сталин1", 2022),
                new Book(2, "Сталин", "Сталин2", 2022),
                new Book(3, "Сталин", "Сталин3", 2022),
                new Book(4, "Ленин", "Ленин1", 2022),
                new Book(5, "Ленин", "Ленин2", 2022),
                new Book(6, "Ленин", "Ленин3", 2022),
        };

        Book[] books2 = {

                new Book(1, "Сталин", "Сталин1", 2022),
                new Book(2, "Сталин", "Сталин2", 2022),
                new Book(3, "Сталин", "Сталин3", 2022),
                new Book(7,"Садыр","Садыр1",2022),
                new Book(7,"Садыр","Садыр2",2022),
                new Book(7,"Садыр","Садыр3",2022),
        };

        Book[] books3 = {new Book(1, "Сталин", "Сталин1", 2022),
                new Book(2, "Сталин", "Сталин2", 2022),
                new Book(3, "Сталин", "Сталин3", 2022),
                new Book(4, "Ленин", "Ленин1", 2022),
                new Book(5, "Ленин", "Ленин2", 2022),
                new Book(6, "Ленин", "Ленин3", 2022),
                new Book(7, "Садыр", "Садыр1", 2022),
                new Book(8, "Садыр", "Садыр2", 2022),
                new Book(9, "Садыр", "Садыр3", 2022),
        };

        Category category1 = new Category("Художественной литературы",books1);
        Category category2 = new Category("Юридической литературы",books2);
        Category category3= new Category("Технической литературы",books3);

        System.out.println(category1);
        System.out.println(category1.toString());
        category1.addBook(new Book(10,"New","New",1999));
        System.out.println("after add");
        System.out.println(category1.toString());



    }
}
