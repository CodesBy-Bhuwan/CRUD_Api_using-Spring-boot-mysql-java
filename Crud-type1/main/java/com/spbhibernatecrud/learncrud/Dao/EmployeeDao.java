package com.spbhibernatecrud.learncrud.Dao;

import com.spbhibernatecrud.learncrud.Model.Emp;

import java.util.List;

public interface EmployeeDao {
    List<Emp> get();

    Emp get(int id);
    void save(Emp emp);

    void delete(int id);
}
