package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entities.Fournisseur;

public interface ClientRepository extends JpaRepository<Fournisseur, Long> {

}