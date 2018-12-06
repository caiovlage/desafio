package br.com.desafio.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("desafio");
        
    public static EntityManager getEntityManager(){
      return emf.createEntityManager();
    }
}