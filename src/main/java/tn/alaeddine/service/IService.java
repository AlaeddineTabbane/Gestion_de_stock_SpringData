package tn.alaeddine.service;

import java.util.List;

import tn.alaeddine.model.Magasin;
import tn.alaeddine.model.Produit;

public interface IService {
	
	List<Produit> getProduits();
	Produit getProduitById(int id);
	List<Magasin> getMagasins();
	Magasin getMagasinById(int id);
	List<Produit> getProduitsByMagasin(int id);
	void ajoutProduit(Produit p);
	void ajoutMagasin(Magasin m);

}
