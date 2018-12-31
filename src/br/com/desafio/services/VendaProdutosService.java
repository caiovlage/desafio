package br.com.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.dao.VendaProdutosDao;
import br.com.desafio.entities.Produto;
import br.com.desafio.entities.VendaProdutos;

@Service
public class VendaProdutosService {

	@Autowired
	private VendaProdutosDao vendaProdutosDao;
	
	
	public VendaProdutosService() {
	}

	public void salvarVendas(int id) {
		
		VendaProdutos venda = new VendaProdutos();
		Produto p = new Produto();
		p.setIdProduto(id);
		venda.setProduto(p);
		vendaProdutosDao.salvar(venda);
	}
}