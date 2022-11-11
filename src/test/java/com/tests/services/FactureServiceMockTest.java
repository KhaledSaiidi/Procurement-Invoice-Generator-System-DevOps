package com.tests.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.main.entities.Facture;
import com.main.repositories.FactureRepository;
import com.main.services.FactureServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;

public class FactureServiceMockTest {
	
	

    @Mock
    FactureRepository facRepository;

   @InjectMocks
   FactureServiceImpl facService;

   Facture f1 = new Facture(1L, 12, 3);
   Facture f2 = new Facture(2L, 13, 4);


    List<Facture> listFactures = new ArrayList<Facture>() {
        {
            add(f1);
            add(new  Facture(1L, 12, 3));
            add(new Facture(2L, 13, 4));
        }
    };

    @Test
    public void testaddFacture(){
        Mockito.when(facRepository.save(f1)).thenReturn(f1);
        Facture facture1 = facService.addFacture(f1);
        //assertNotNull(produit1);
        Mockito.verify(facRepository, times(1)).save(Mockito.any(Facture.class));
        System.out.println("3");
    }

    @Test
    public void testRetrieveFacture() {

        Mockito.when(facRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(f1));
        Facture facture1 = facService.retrieveFacture(1L);
        assertNotNull(facture1);
        System.out.println("1");
        assertEquals(facture1.getIdFacture(),1L);
   }

   /* @Test
    public void testretrieveAllFactures() {
        Mockito.when(facRepository.findAll()).thenReturn(listFactures);
        List<Facture> listfacture = facService.retrieveAllFactures();
        assertEquals(3, listfacture.size());
        //assertEquals(produit1.getIdProduit(),55L);
        System.out.println("2555");
    }
   
*/
}
