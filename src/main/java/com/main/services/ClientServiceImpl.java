package com.main.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.entities.Client;
import com.main.repositories.ClientRepository;
import com.mysql.cj.log.Log;



public class ClientServiceImpl implements IClientService {

	@Autowired
	ClientRepository ClientRepository;
	@Autowired
	
	@Override
	public List<Client> retrieveAllClients() {
		List<Client> Clients = List<Client> ClientRepository.findAll();
		for (Client Client : Clients) {
			Log.info(" Client : " + Client);
		}
		return Clients;
	}


	}