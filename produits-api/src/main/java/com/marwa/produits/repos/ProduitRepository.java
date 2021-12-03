package com.marwa.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marwa.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
