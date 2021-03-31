package com.example.register.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.register.model.RouteModel;


@Repository
public interface Routerepo extends CrudRepository<RouteModel,Integer> {

}