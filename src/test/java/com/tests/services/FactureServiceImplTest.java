package com.tests.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.entities.Facture;
import com.main.repositories.FactureRepository;
import com.main.services.IFactureService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class FactureServiceImplTest {
	 @Autowired
	    IFactureService facService;

	    @Autowired
	    FactureRepository facRepository;

	    Facture f1 = new Facture(1L, 12, 2);
	    Facture f2 = new Facture(2L, 13, 5);
	    @Test
	    @Order(1)
	    public void testaddFacture() {
	    	Facture facAdded =  facService.addFacture(f1);
	        Assertions.assertEquals(facAdded.getIdFacture(), facAdded.getIdFacture());
	    }
	    
	    
	    

	    @Test
	    @Order(2)
	    public void testRetrieveAllFactures() {
	        List<Facture> listFactures = facService.retrieveAllFactures();
	        Assertions.assertEquals(listFactures.size(), listFactures.size());
	    }

	  
		
	

}
