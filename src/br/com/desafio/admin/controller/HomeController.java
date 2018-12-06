package br.com.desafio.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.desafio.services.VendaProdutosService;

@Controller
public class HomeController {
	
	private VendaProdutosService vendaProdutosService;
	
	@RequestMapping("/admin/home")
	public ModelAndView home() {
		vendaProdutosService = new VendaProdutosService();
		
		ModelAndView model = new ModelAndView();
		model.addObject("vendas", vendaProdutosService.getAll());
		model.setViewName("home");
		
		return model;
	}
	
	@RequestMapping("/admin/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
}