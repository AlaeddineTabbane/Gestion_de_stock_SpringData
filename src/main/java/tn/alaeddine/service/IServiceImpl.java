package tn.alaeddine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.alaeddine.model.Magasin;
import tn.alaeddine.model.Produit;
import tn.alaeddine.repository.IGestionMagasin;
import tn.alaeddine.repository.IGestionProduit;

@Service
public class IServiceImpl implements IService {
	
	@Autowired
	IGestionMagasin magasin;
	@Autowired
	IGestionProduit produit;
	
	public void setProduit(IGestionProduit produit) {
		this.produit = produit;
	}
	
	public void setMagasin(IGestionMagasin magasin) {
		this.magasin = magasin;
	}

	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produit.findAll();
	}

	public Produit getProduitById(int id) {
		// TODO Auto-generated method stub
		return produit.findOne(id);
	}

	public List<Magasin> getMagasins() {
		// TODO Auto-generated method stub
		return magasin.findAll();
	}

	public List<Produit> getProduitsByMagasin(int id) {
		// TODO Auto-generated method stub
		return produit.findProduitByMag(id);
	}

	public void ajoutProduit(Produit p) {
		// TODO Auto-generated method stub
		produit.save(p);
	}

	public Magasin getMagasinById(int id) {
		// TODO Auto-generated method stub
		return magasin.findOne(id);
	}

	public void ajoutMagasin(Magasin m) {
		// TODO Auto-generated method stub
		magasin.save(m);
	}

}
