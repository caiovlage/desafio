package br.com.desafio.services;

import java.util.List;
import br.com.desafio.dao.VendaProdutosDao;
import br.com.desafio.entities.Produto;
import br.com.desafio.entities.VendaProdutos;

public class VendaProdutosService {

	private VendaProdutosDao vendaProdutosDao;
	public VendaProdutosService() {
		vendaProdutosDao = new VendaProdutosDao();
	}

	public void salvarVendas(int id) {
		
		VendaProdutos venda = new VendaProdutos();
		Produto p = new Produto();
		p.setIdProduto(id);
		venda.setProduto(p);
		vendaProdutosDao.save(venda);
	}
	public List<VendaProdutos> getAll() {
		return vendaProdutosDao.findAll();
	}
}