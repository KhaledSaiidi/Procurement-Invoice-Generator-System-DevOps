package com.tests.services;


import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.main.entities.Produit;
import com.main.entities.Stock;
import com.main.services.IProduitService;
import com.main.services.IStockService;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProduitServiceImplTest {
	@Autowired
	IProduitService produitService;
	@Autowired
	IStockService stockService;
	
	@Test
	public void testAddProduit() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreation = dateFormat.parse("15/10/2022");
		Produit p = new Produit(null, "Prod1", "voiture", 0, dateCreation, null, null, null, null);
		Produit produit = produitService.addProduit(p);
		log.info("Produit: "+produit);
		assertNotNull(produit.getIdProduit());
		assertTrue(produit.getCodeProduit().length() > 0);
		produitService.deleteProduit(produit.getIdProduit());
		log.info("Product added successfully");
		
	}
	
	@Test
	public void testDeleteProduit() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreation = dateFormat.parse("15/10/2022");
		Date dateDerniereModification = dateFormat.parse("14/10/2022");
		Produit p = new Produit(null, "Prod1", "voiture", 0, dateCreation, dateDerniereModification, null, null, null);
		Produit produit = produitService.addProduit(p);
		produitService.deleteProduit(produit.getIdProduit());
		assertNull(produitService.retrieveProduit(produit.getIdProduit()));
				log.info("Product deleted successfully");

	}
	
@Test
	public void testRetrieveAllProduits() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreation = dateFormat.parse("15/10/2022");
		Date dateDerniereModification = dateFormat.parse("14/10/2022");
		List<Produit> produits = produitService.retrieveAllProduits();
		int expected = produits.size();
		Produit p = new Produit(null, "Prod1", "voiture", 0, dateCreation, dateDerniereModification, null, null, null);
		Produit produit = produitService.addProduit(p);
		assertEquals(expected + 1, produitService.retrieveAllProduits().size());
		produitService.deleteProduit(produit.getIdProduit());
				log.info("Product retrieved successfully");

	}
	
	
	@Test
	public void testAssignProduitToStock() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreation = dateFormat.parse("15/10/2022");
		Stock s = new Stock("stock1",10,200);
		Stock savedStock= stockService.addStock(s);
		Produit p = new Produit(null, "Prod1", "voiture", 0, dateCreation, null, null, null, null);
		Produit produit = produitService.addProduit(p);
		log.info("Stock: "+savedStock);
		log.info("Produit: "+produit);
		produitService.assignProduitToStock(produit.getIdProduit(), savedStock.getIdStock());
		//assertNotNull(produit.getStock());
		//stockService.deleteStock(savedStock.getIdStock());
		produitService.deleteProduit(produit.getIdProduit());
	     log.info("Product assigned to stock successfully");

	}

}
