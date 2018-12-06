package br.com.desafio.site.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.desafio.entities.Produto;
import br.com.desafio.services.ProdutoService;

@Controller
public class HomeController {

	private ProdutoService produtoService;

	@RequestMapping(value ="/index", method = RequestMethod.GET)
	public ModelAndView index(@RequestParam(value = "categoria", required=false) String categoria) {
		
		produtoService = new ProdutoService();

		ModelAndView modelAndView = new ModelAndView();

		if(categoria != null && !categoria.trim().equals("")) {
			modelAndView.addObject("produtos",produtoService.getByCategoria(categoria));
		}	
		else
			modelAndView.addObject("produtos",produtoService.getAll());
		
		modelAndView.addObject("categorias",produtoService.getCategorias());
		return modelAndView; 
	}
}