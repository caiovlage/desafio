package br.com.desafio.services;

import java.util.List;

import br.com.desafio.dao.ProdutoDao;
import br.com.desafio.dao.VendaProdutosDao;
import br.com.desafio.entities.Produto;
import br.com.desafio.entities.VendaProdutos;

public class VendaProdutosService {

	private VendaProdutosDao vendaProdutosDao;
	private ProdutoDao produtoDao;
	
	
	public VendaProdutosService() {
		vendaProdutosDao = new VendaProdutosDao();
		produtoDao = new ProdutoDao();
	}

	public void salvarVendas(int id) {
		
		VendaProdutos venda = new VendaProdutos();
		Produto p = new Produto();
		p.setIdProduto(id);
		venda.setProduto(p);
		vendaProdutosDao.save(venda);
	}
	public List<Produto> getAll() {
		return produtoDao.findAll();
	}
}