package tn.alaeddine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.alaeddine.model.Magasin;

@Repository
public interface IGestionMagasin extends JpaRepository<Magasin, Integer> {

}
