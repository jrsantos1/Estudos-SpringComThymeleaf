package br.com.aulas.spgmvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.aulas.spgmvc.mudi.model.Pedido;
import br.com.aulas.spgmvc.mudi.repositorys.PedidoRepository;
@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> listaPedidos = pedidoRepository.findAll();
		
		//Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		//List<Pedido> listaPedidos = query.getResultList();
		
		model.addAttribute("produto", listaPedidos);
		
		return "home";
	
	}
}
