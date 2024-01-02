package com.spbhibernatecrud.learncrud.Dao;

import com.spbhibernatecrud.learncrud.Model.Emp;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class EmployeeDaoImp implements EmployeeDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Emp> get() {
        Session currentSession =entityManager.unwrap(Session.class);
        Query<Emp> query = currentSession.createQuery("from Employee.class", Emp.class);
        List<Emp> list= query.getResultList();
        return list;
    }

    @Override
    public Emp get(int id) {
        return null;
    }

    @Override
    public void save(Emp emp) {

    }

    @Override
    public void delete(int id) {

    }
}
