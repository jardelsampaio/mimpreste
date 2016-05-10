package br.unifor.mimpreste.dao;

import java.util.List;

/**
 * Created by bruno on 09/05/2016.
 */
public interface IDatabase<T> {

    void insert(T obj);

    void update(T obj);

    void delete (T obj);

    T find(Integer id);

    List<T> findAll();

}
