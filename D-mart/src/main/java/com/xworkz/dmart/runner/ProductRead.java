package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.ProductEntity;
import jdk.nashorn.internal.parser.JSONParser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class ProductRead {
    public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager entityManager=null;

        try{
            emf= Persistence.createEntityManagerFactory("x-workz");
            entityManager =emf.createEntityManager();
            ProductEntity ref=entityManager.find(ProductEntity.class,1);//for reading  data
            System.out.println(ref);

        }
        catch(PersistenceException e)
        {
            e.printStackTrace();


        }
        finally{
            if(emf!=null)
            {
                emf.close();

            }
            if(entityManager!=null)
            {
                entityManager.close();
            }
        }
    }
}
