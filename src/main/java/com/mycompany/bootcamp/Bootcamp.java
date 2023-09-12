/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bootcamp;

import java.util.List;

/**
 *
 * @author eddyb
 */
public class Bootcamp {

    public static void main(String[] args) {
        DaoImpl chito = new DaoImpl();
        /*Customer customer = chito.getCustomerById(1);
        
        if (customer == null) {
            customer = new Customer();
            customer.setEmail("eddy.barales@gmail.com");
            customer.setFirsName("Eddy");
            customer.setLastName("Barales");
            chito.createCustomer(customer);
        }
        
        customer.setLastName("Barales");
        chito.updateCustomer(customer);
        
        System.out.println("Customer " + customer);*/
        
        List<Customer> customers = chito.getCustomers();
        for (Customer customer : customers) {
            System.out.println("found " + customer);
        }
    }
}
