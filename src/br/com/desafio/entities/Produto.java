package br.com.desafio.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduto")
	private int idProduto;
	@Column
	private String titulo;
	@Column
	private String categoria;
	@Column
	private String descricao;
	@Column
	private String foto;
	@Column
	private double preco;
	
	@OneToMany(mappedBy="produto", cascade = CascadeType.ALL)  
	private List<VendaProdutos> vendaProdutos;
	
	
	public Produto() { }
	
	public Produto(int   idProduto,
			       String titulo,
			       String categoria,
			       String foto) {
		
		this.titulo = titulo;
		this.categoria = categoria;
		this.foto = foto;
	}

	
	
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public List<VendaProdutos> getVendaProdutos() {
		return vendaProdutos;
	}

	public void setVendaProdutos(List<VendaProdutos> vendaProdutos) {
		this.vendaProdutos = vendaProdutos;
	}

	
}
