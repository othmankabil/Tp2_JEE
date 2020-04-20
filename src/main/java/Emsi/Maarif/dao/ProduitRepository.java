package Emsi.Maarif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Emsi.Maarif.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>
{

}
