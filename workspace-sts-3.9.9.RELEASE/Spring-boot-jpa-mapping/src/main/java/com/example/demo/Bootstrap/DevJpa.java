package com.example.demo.Bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Author;
import com.example.demo.Model.Book;
import com.example.demo.Model.Publisher;
import com.example.demo.Repo.AuthorRepo;
import com.example.demo.Repo.BookRepo;
import com.example.demo.Repo.PublisherRepo;
@Component
public class DevJpa implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepo authorrepo;
	private PublisherRepo publisherrepo;
	private BookRepo bookrepo;
	
	
	public DevJpa(AuthorRepo authorrepo, PublisherRepo publisherrepo, BookRepo bookrepo) {
		super();
		this.authorrepo = authorrepo;
		this.publisherrepo = publisherrepo;
		this.bookrepo = bookrepo;
	}


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}


	private void init() {
		
		
		Publisher publisher = new Publisher();
		publisher.setName("Vikram");
		publisher.setAddress("12th Street, Banglore");
		publisherrepo.save(publisher);

		// Eric
		Author eric = new Author("Vivek", "Evans");
		Book ddd = new Book("Domain Driven Design", "fsd123", publisher);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorrepo.save(eric);
		bookrepo.save(ddd);

		// Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorrepo.save(rod);
		bookrepo.save(noEJB);
		

		
	}

}
