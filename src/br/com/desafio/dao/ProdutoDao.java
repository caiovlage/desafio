package br.com.desafio.dao;

import java.util.List;
import javax.persistence.EntityManager;

import br.com.desafio.entities.Produto;
import br.com.desafio.factory.EntityFactory;
  
public class ProdutoDao {
  
         private static ProdutoDao instance;
         protected EntityManager entityManager;
          
         public static ProdutoDao getInstance(){
                   if (instance == null){
                            instance = new ProdutoDao();
                   }
                   return instance;
         }
         
         public ProdutoDao() {
                   entityManager = EntityFactory.getEntityManager();
         }
  
         public Produto getById(final int id) {
                   return entityManager.find(Produto.class, id);
         }
  
         @SuppressWarnings("unchecked")
         public List<Produto> findAll() {
                   return entityManager.createQuery("FROM " + Produto.class.getName()).getResultList();
         }
         
         @SuppressWarnings("unchecked")
         public List<String> getCategorias()
         {
        	 
        	 return entityManager.createQuery("SELECT DISTINCT p.categoria FROM Produto p").getResultList();
         }
  
         @SuppressWarnings("unchecked")
         public List<Produto> getByCategoria(String categoria)
         {
        	 return entityManager.createQuery("select p FROM Produto p where p.categoria like'%"+categoria+"%'").getResultList();
         }
         
         public void save(Produto produto) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(produto);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
}