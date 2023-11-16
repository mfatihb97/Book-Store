package bookstore.fatih;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

       /* Publisher publisher = new Publisher();
        publisher.setName("Patika Yayıncılık");
        publisher.setAddress("İstanbul - Kadıköy");
        publisher.setYear(2010);
        entityManager.persist(publisher);

        Category category = new Category();
        category.setName("Biyografi");
        category.setDescription("Yaşamını anlat!");
        entityManager.persist(category);


        Author author = new Author();
        author.setName("Fatih Batur");
        author.setBirthday(LocalDate.parse("1997-04-27"));
        author.setCountry("Turkey");
        entityManager.persist(author);

        Book book = new Book();
        book.setAuthor(author);
        book.setName("Fatih'in Günlüğü");
        book.setPublisher(publisher);
        book.setPublic_year(2023);
        book.setStock(50);
        entityManager.persist(book);

        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setBook(book);
        bookBorrowing.setName(book.getName());
        bookBorrowing.setBorrow_date(LocalDate.parse("2023-11-16"));
        bookBorrowing.setReturn_date(LocalDate.parse("2023-11-25"));
        entityManager.persist(bookBorrowing);

        Category categoryFiction = new Category("Fiction","Fiction Books");
        Category categoryRomance = new Category("Romance","Romance Books");
        entityManager.persist(categoryFiction);
        entityManager.persist(categoryRomance);


        List<Category> categoryList = new ArrayList<>();
        categoryList.add(categoryFiction);
        categoryList.add(categoryRomance);
        entityManager.persist(book);
        book.setCategoryList(categoryList);
        */



        Book book = entityManager.find(Book.class,1);
        System.out.println(book.getCategoryList().toString());

        entityManager.getTransaction().commit();

    }
}
