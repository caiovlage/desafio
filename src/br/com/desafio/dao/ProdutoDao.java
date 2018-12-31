package br.com.desafio.dao;

import java.util.List;
import br.com.desafio.dao.GenericDao;
import br.com.desafio.entities.Produto;
import br.com.desafio.factory.EntityFactory;

public class ProdutoDao extends GenericDao<Produto>{
         
         public ProdutoDao() 
         {
        	 	 super(Produto.class);
                 entityManager = EntityFactory.getEntityManager();
         }
         
         @SuppressWarnings("unchecked")
         public List<String> getCategorias()
         { 
        	 return entityManager.createQuery("SELECT DISTINCT p.categoria FROM Produto p").getResultList();
         }
         
         public List<Produto> getList()
         {
        	 return super.getList();
         }
  
         @SuppressWarnings("unchecked")
         public List<Produto> getByCategoria(String categoria)
         {
        	 return entityManager.createQuery("select p FROM Produto p where p.categoria like'%"+categoria+"%'").getResultList();
         }
}