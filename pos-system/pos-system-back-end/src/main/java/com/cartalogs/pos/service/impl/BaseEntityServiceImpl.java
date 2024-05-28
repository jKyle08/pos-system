package com.cartalogs.pos.service.impl;

import com.cartalogs.pos.service.BaseEntityService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BaseEntityServiceImpl<T, ID> implements BaseEntityService<T, ID> {

    private final JpaRepository<T, ID> repository;

    public BaseEntityServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T update(T entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
