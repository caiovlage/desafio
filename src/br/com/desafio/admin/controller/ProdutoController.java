package br.com.desafio.admin.controller;

import java.text.DecimalFormat;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import br.com.desafio.entities.Produto;
import br.com.desafio.services.ProdutoService;
import br.com.desafio.services.VendaProdutosService;

@Controller
public class ProdutoController {
	
	private ProdutoService produtoService;
	
	
	@RequestMapping("/admin/produto")
	public ModelAndView produto() {
		Produto produto = new Produto();
		
		return new ModelAndView("produto","command", produto);
	}
	
	@RequestMapping(value = "/admin/addProduto", method = RequestMethod.POST)
	public ModelAndView addProduto(@ModelAttribute("produto") Produto produto) {
		
		produtoService = new ProdutoService();
		produtoService.salvarProduto(produto);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("command", new Produto());
		modelAndView.addObject("success", true);
		modelAndView.setViewName("produto");
		return modelAndView;
	}
}