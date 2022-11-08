package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.CategorieProduit;

@Repository
public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long>{

}
