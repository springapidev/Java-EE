package com.coderbd.mongodbfulltextsearch.dao;


import com.coderbd.mongodbfulltextsearch.doc.Car;

import java.util.List;


public interface CarDao {

    public void create(Car car);

    public void update(Car car);

    public void delete(Car car);

    public void deleteAll();

    public Car find(Car car);

    public List<Car> findAll();

    public List<Car> searchByText(String str);
}