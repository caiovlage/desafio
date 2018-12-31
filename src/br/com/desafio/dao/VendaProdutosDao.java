package br.com.desafio.dao;

import org.springframework.stereotype.Repository;

import br.com.desafio.dao.GenericDao;
import br.com.desafio.entities.VendaProdutos;
import br.com.desafio.factory.EntityFactory;
  
@Repository
public class VendaProdutosDao extends GenericDao<VendaProdutos> {
         
         public VendaProdutosDao() {
        	 super(VendaProdutos.class);
                   entityManager = EntityFactory.getEntityManager();
         }
}

