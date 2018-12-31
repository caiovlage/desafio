package br.com.desafio.site.controller;

import java.text.DecimalFormat;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.desafio.services.ProdutoService;
import br.com.desafio.services.VendaProdutosService;

@Controller
public class HomeController {
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private VendaProdutosService vendaProdutosService;
	
	private ModelAndView modelAndView;

	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView index(@RequestParam(value = "categoria", required=false) String categoria) 
	{
		modelAndView = new ModelAndView();		
		if(categoria != null && !categoria.trim().equals("")) {
			modelAndView.addObject("produtos",produtoService.getByCategoria(categoria));
		}
		else
			modelAndView.addObject("produtos",produtoService.getAll());
		
		modelAndView.addObject("categorias",produtoService.getCategorias());
		modelAndView.setViewName("index");
		return modelAndView; 
	}
	
	@RequestMapping(value ="/detalheProduto", method = RequestMethod.GET)
	public ModelAndView detalheProduto(@RequestParam(value = "id", required=false) int id) 
	{	
		modelAndView = new ModelAndView();
		modelAndView.addObject("produto",produtoService.getById(id));
		modelAndView.addObject("categorias",produtoService.getCategorias());
		return modelAndView; 
	}

	@RequestMapping(value ="/finalizarPedido", method = RequestMethod.GET)
	public ModelAndView pedidoFinalizado(@RequestParam(value = "id", required=true) int id)
	{
		DecimalFormat formatador = new DecimalFormat("0.00");
		vendaProdutosService.salvarVendas(id);
		modelAndView = new ModelAndView();
		modelAndView.addObject("frete",Double.parseDouble(formatador.format(1.00D + new Random().nextDouble() * (100.00D - 1.00D )).replaceAll(",", ".")));
		modelAndView.addObject("entrega", 1 + new Random().nextInt(100-1) + 1);
		modelAndView.addObject("produto",produtoService.getById(id));
		modelAndView.addObject("categorias",produtoService.getCategorias());
		return modelAndView; 
	}
}