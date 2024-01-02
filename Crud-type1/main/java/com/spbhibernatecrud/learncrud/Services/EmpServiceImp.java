package com.spbhibernatecrud.learncrud.Services;

import com.spbhibernatecrud.learncrud.Dao.EmployeeDao;
import com.spbhibernatecrud.learncrud.Model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpServiceImp implements EmpService{

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public List<Emp> get() {

        return employeeDao.get();
    }
    @Transactional
    @Override
    public Emp get(int id) {
        return null;
    }
    @Transactional
    @Override
    public void save(Emp emp) {

    }
    @Transactional
    @Override
    public void delete(int id) {

    }
}
