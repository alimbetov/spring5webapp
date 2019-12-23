package com.springfw.spring5webapp.repositories;

import com.springfw.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PublisherRepository extends CrudRepository <Publisher,Long> {
    @Override
    <S extends Publisher> S save(S s);

    @Override
    <S extends Publisher> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Optional<Publisher> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Publisher> findAll();

    @Override
    Iterable<Publisher> findAllById(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Publisher publisher);

    @Override
    void deleteAll(Iterable<? extends Publisher> iterable);

    @Override
    void deleteAll();
}
