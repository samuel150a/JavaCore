package com.xworkz.dmart.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("x-workz");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();
    }
}
