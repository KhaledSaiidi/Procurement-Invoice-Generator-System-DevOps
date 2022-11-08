package com.main.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.SecteurActivite;

@Repository
public interface SecteurActiviteRepository extends CrudRepository<SecteurActivite, Long> {

}
