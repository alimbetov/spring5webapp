package com.springfw.spring5webapp.bootsrap;

import com.springfw.spring5webapp.model.Author;
import com.springfw.spring5webapp.model.Book;
import com.springfw.spring5webapp.model.Publisher;
import com.springfw.spring5webapp.repositories.AuthorRepository;
import com.springfw.spring5webapp.repositories.BookRepostory;
import com.springfw.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevbootStrap implements ApplicationListener <ContextRefreshedEvent> {

    AuthorRepository authorRepository;

    BookRepostory bookRepostory;

    PublisherRepository publisherRepository;

    public DevbootStrap(AuthorRepository authorRepository, BookRepostory bookRepostory, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepostory = bookRepostory;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){


        Publisher publisher = new Publisher();
        publisher.setName("Fooo");
        publisher.setAddrress("Abay av");

        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book ("Domain Driven Design","1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);


        authorRepository.save(eric);
        bookRepostory.save(ddd);


        Author rod = new Author("Rod","JohnSon");
        Book bbb = new Book ("Java 2EE without EJB","2344",publisher);
         rod.getBooks().add(bbb);
        bbb.getAuthors().add(rod);


        authorRepository.save(rod);
        bookRepostory.save(bbb);


    }


}
