package com.spbhibernatecrud.learncrud.Services;

import com.spbhibernatecrud.learncrud.Model.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> get();

    Emp get(int id);
    void save(Emp emp);

    void delete(int id);

}
