package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Students;

public interface StudentDAO  extends CrudRepository<Students, Integer>{

}
