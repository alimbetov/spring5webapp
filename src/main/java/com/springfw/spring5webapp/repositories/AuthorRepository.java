package com.springfw.spring5webapp.repositories;

import com.springfw.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author,Long> {
    @Override
    <S extends Author> S save(S s);

    @Override
    <S extends Author> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Optional<Author> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Author> findAll();

    @Override
    Iterable<Author> findAllById(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Author author);

    @Override
    void deleteAll(Iterable<? extends Author> iterable);

    @Override
    void deleteAll();
}
