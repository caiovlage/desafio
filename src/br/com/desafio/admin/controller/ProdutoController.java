package br.com.desafio.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import br.com.desafio.entities.Produto;
import br.com.desafio.services.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	private ModelAndView modelAndView;
	
	@RequestMapping("/admin/produto")
	public ModelAndView produto() 
	{
		modelAndView = new ModelAndView();
		modelAndView.addObject("command", new Produto());
		modelAndView.setViewName("produto");
		return modelAndView;
	}
	@RequestMapping(value = "/admin/addProduto", method = RequestMethod.POST)
	public ModelAndView addProduto(@ModelAttribute("produto") Produto produto) 
	{	
		produtoService.salvarProduto(produto);
		modelAndView = new ModelAndView();
		modelAndView.addObject("success", true)
				    .addObject("command", new Produto())
				    .setViewName("produto");
		return modelAndView;
	}
	@RequestMapping("/admin/home") 
	public ModelAndView home() 
	{	
		modelAndView = new ModelAndView();
		modelAndView.addObject("vendas", produtoService.getAll()).setViewName("home");
		return modelAndView;
	}
	@RequestMapping("/admin")
	public ModelAndView index() {
		return new ModelAndView("login");
	}
}