package tn.alaeddine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.alaeddine.model.Produit;

@Repository
public interface IGestionProduit extends JpaRepository<Produit, Integer> {
	
	@Query("select p from Produit p where magasin_id=:id")
	public List<Produit> findProduitByMag(@Param("id") int id);

}
