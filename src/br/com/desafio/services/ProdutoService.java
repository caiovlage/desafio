package br.com.desafio.services;

import java.util.List;
import java.util.Random;

import br.com.desafio.dao.ProdutoDao;
import br.com.desafio.entities.Produto;

public class ProdutoService {

	private ProdutoDao produtoDao;

	public ProdutoService() {
		produtoDao = new ProdutoDao();
	}

	public void salvarProduto(Produto produto) {
			produtoDao.save(produto);
	}
	public Produto getDetalhesProduto(int idProduto) {
		return produtoDao.getById(idProduto);
	}
	
	public List<Produto> getAll() {
		return produtoDao.findAll();
	}
	
	public Produto getById(int idProduto) {
		return produtoDao.getById(idProduto);
	}
	
	public List<String> getCategorias(){
		return produtoDao.getCategorias();
	}
	
	public List<Produto> getByCategoria(String categoria){
		return produtoDao.getByCategoria(categoria);
	}
}