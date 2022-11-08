package com.tests.services;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.main.entities.CategorieClient;
import com.main.entities.Client;
import com.main.services.IClientService;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientServiceImplTest {
	@Autowired
	IClientService clientService;

	
	@Test
	public void testRetrieveAllClients() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		List<Client> clients = clientService.retrieveAllClients();
		int expected = clients.size();
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", 
				CategorieClient.ORDINAIRE);
		assertEquals(expected + 1, clientService.retrieveAllClients().size());
		

	}
	

}
