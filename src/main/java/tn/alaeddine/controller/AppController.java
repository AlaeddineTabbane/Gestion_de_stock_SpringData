package tn.alaeddine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.alaeddine.model.Magasin;
import tn.alaeddine.model.Produit;
import tn.alaeddine.service.IService;

@Controller
public class AppController {
	
	@Autowired
	IService service;
	
	public void setService(IService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/magasins" , method=RequestMethod.GET)
	public String getMag(Model model) {
		List<Magasin> listM=service.getMagasins();
		model.addAttribute("listM", listM);
		return "magasins";
	}
	
	@RequestMapping(value="/produits/magasin/{id}",method=RequestMethod.GET)
	public String getProduit(Model model,@PathVariable("id") int id) {
		List<Produit> listP=service.getProduitsByMagasin(id);
		Magasin mag= service.getMagasinById(id);
		model.addAttribute("listP", listP);
		model.addAttribute("mag", mag);
		return "produits";
	}
	
	@RequestMapping(value="/ajoutproduit",method=RequestMethod.GET)
	public String addProd(Model model,@ModelAttribute("prod") Produit p) {
		List<Magasin> listM=service.getMagasins();
		model.addAttribute("listM", listM);
		return "addproduit";
	}
	
	@RequestMapping(value="/saveProduit",method=RequestMethod.POST)
	public String saveProd(Model model,@ModelAttribute("prod") Produit p ) {
		service.ajoutProduit(p);
		return "redirect:/magasins";
	}
	
	@RequestMapping(value="/ajoutmagasin",method=RequestMethod.GET)
	public String addMagasin(Model model,@ModelAttribute("mag") Magasin m) {
		return "addmagasin";
	}
	
	@RequestMapping(value="/saveMagasin",method=RequestMethod.POST)
	public String savemag(Model model,@ModelAttribute("mag") Magasin m) {
		service.ajoutMagasin(m);
		return "redirect:/magasins";
	}

}
