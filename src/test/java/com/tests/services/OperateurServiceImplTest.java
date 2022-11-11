package com.tests.services;
 
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.main.entities.Facture;
import com.main.entities.Operateur;
import com.main.entities.Produit;
import com.main.services.IOperateurService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OperateurServiceImplTest {

	@Autowired
	IOperateurService operateurService; 
	@Test
	public void testAddOperator() throws ParseException {
		Set<Facture> facture = new HashSet<>();
		Operateur o = new Operateur(null, "Operator1", "Operator2", "pwd", facture);
		Operateur operateur = operateurService.addOperateur(o);
		log.info("Operator: "+operateur);
		assertNotNull(operateur.getIdOperateur());
		assertTrue(operateur.getNom().length() > 0);
		operateurService.deleteOperateur(operateur.getIdOperateur());
		log.info("Operator 	added successfully");

	}
	@Test
	public void testDeleteOperator() throws ParseException {
		Set<Facture> facture = new HashSet<>();
		Operateur o = new Operateur(null, "Operator1", "Operator2", "pwd", facture);
		Operateur operateur = operateurService.addOperateur(o);
		operateurService.deleteOperateur(operateur.getIdOperateur());
		log.info("Operator deleted successfully");
	}
	
	@Test
	public void testRetrieveAllOperateurs() throws ParseException {
		
		List<Operateur> Operateurs = operateurService.retrieveAllOperateurs();
		int expected = Operateurs.size();
		Set<Facture> facture = new HashSet<>();
		Operateur o = new Operateur(null, "Operator1", "Operator2", "pwd", facture);
		Operateur operateur = operateurService.addOperateur(o);
		assertEquals(expected + 1, operateurService.retrieveAllOperateurs().size());
		operateurService.deleteOperateur(operateur.getIdOperateur());
		log.info("Operators retrieved successfully");

	}

} 
