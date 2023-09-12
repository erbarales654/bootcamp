/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bootcamp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author eddyb
 */
public class DaoImpl {
    
    private EntityManager emf;
    
    public DaoImpl(){
        emf = Persistence.createEntityManagerFactory("com.mycompany_bootcamp_jar_1.0-SNAPSHOTPU").createEntityManager();
    }
    
    public Customer getCustomerById(int id) {
        return emf.find(Customer.class, id);
    }
    
    public List<Customer> getCustomerByEmail(String email) {
        Query query = emf.createNamedQuery("Customer.findByEmail");
        query.setParameter("email", email);
        return query.getResultList();
    }    
    
    public void createCustomer(Customer customer) {
        emf.getTransaction().begin();
        emf.persist(customer);
        emf.getTransaction().commit();
    }
    
    public void updateCustomer(Customer customer) {
        emf.getTransaction().begin();
        emf.merge(customer);
        emf.getTransaction().commit();
    }
    
    public List<Customer> getCustomers() {
        Query query = emf.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }
    
}
