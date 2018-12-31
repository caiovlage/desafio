package br.com.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.dao.ProdutoDao;
import br.com.desafio.entities.Produto;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoDao produtoDao;

	public ProdutoService() {
	}

	public void salvarProduto(Produto produto) {
			produtoDao.salvar(produto);
	}
	public Produto getDetalhesProduto(int idProduto) {
		return produtoDao.encontrar(idProduto);
	}
	
	public List<Produto> getAll() {
		return produtoDao.getList();
	}
	
	public Produto getById(int idProduto) {
		return produtoDao.encontrar(idProduto);
	}
	
	public List<String> getCategorias(){
		return produtoDao.getCategorias();
	}
	
	public List<Produto> getByCategoria(String categoria){
		return produtoDao.getByCategoria(categoria);
	}
}