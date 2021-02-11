package com.example.Teste.framework;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public abstract class CrudServiceImpl<T, ID> implements CrudService<T, ID> {

    public  abstract JpaRepository<T, ID> getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        return getRepository().findById(id);
    }

    @Override
    @Transactional
    public T save(T t) {
        preSave(t);
        t = getRepository().save(t);
        postSave(t);
        return t;
    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public void preSave(T t) {

    }

    @Override
    public void postSave(T t) {

    }
}
