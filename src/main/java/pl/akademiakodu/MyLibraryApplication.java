package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.akademiakodu.dao.BookDao;
import pl.akademiakodu.dao.PersonDao;
import pl.akademiakodu.dao.UserDao;
import pl.akademiakodu.model.Book;
import pl.akademiakodu.model.Person;
import pl.akademiakodu.model.User;
import pl.akademiakodu.model.UserDetails;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class MyLibraryApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(MyLibraryApplication.class, args);
        /*
        BookDao dao = ctx.getBean(BookDao.class);
		Book book = new Book("Spring is cool :)", "Hibernate is so cool","222");
        dao.save(book);
        //ctx.close();
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz","1234");
        dao.save(book2);

		PersonDao personDao = ctx.getBean(PersonDao.class);
		Person person = new Person("Jan", "Kowalski");
		personDao.save(person);
        Person person2 = new Person("Adam", "Nowak");
        personDao.save(person2);
        */

        UserDao userDao = ctx.getBean(UserDao.class);
        User user = new User("johnny234", "strongPass", "johnny@gmail.com");
        UserDetails details = new UserDetails("John", "Kowalski", "Krakowska 55, Warszawa");
        user.setUserDetails(details);

        userDao.save(user);


        ctx.close();
	}
}
