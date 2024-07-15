package org.itstep.dao.hibernate;

import java.util.List;

public interface BaseEntity<T, ID> {


     void add(T t);
     void update(T t);
     void delete(T t);
     T findById(ID id);
     List<T> findAll();



}
