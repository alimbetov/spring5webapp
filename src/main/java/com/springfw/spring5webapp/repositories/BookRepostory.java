package com.springfw.spring5webapp.repositories;

import com.springfw.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepostory extends CrudRepository<Book,Long> {

    @Override
    <S extends Book> S save(S s);

    @Override
    <S extends Book> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Optional<Book> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Book> findAll();

    @Override
    Iterable<Book> findAllById(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Book book);

    @Override
    void deleteAll(Iterable<? extends Book> iterable);

    @Override
    void deleteAll();
}
