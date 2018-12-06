package br.com.desafio.dao;

import java.util.List;
import javax.persistence.EntityManager;

import br.com.desafio.entities.Produto;
import br.com.desafio.entities.VendaProdutos;
import br.com.desafio.factory.EntityFactory;
  
public class VendaProdutosDao {
  
         private static VendaProdutosDao instance;
         protected EntityManager entityManager;
          
         public static VendaProdutosDao getInstance(){
                   if (instance == null){
                            instance = new VendaProdutosDao();
                   }
                   return instance;
         }
  
         public VendaProdutosDao() {
                   entityManager = EntityFactory.getEntityManager();
         }
  
         @SuppressWarnings("unchecked")
         public List<VendaProdutos> findAll() {
                   return entityManager.createQuery("FROM " + VendaProdutos.class.getName()).getResultList();
         }
  
         public void save(VendaProdutos vendasProdutos) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(vendasProdutos);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
}