package com.ab.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.client.dto.ClientDTO;
import com.ab.client.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService service;
	
	@GetMapping
 	public ResponseEntity<List<ClientDTO>> findAll() {

 		// List<Client> list = new ArrayList<>();
 		// list.add(new Client(1L, "João Arantes", "12345678901", 2700.00, Instant.parse("1979-02-13T10:00:00Z"), 1));
 		// list.add(new Client(2L, "Maria Ribas", "23456789012", 5800.00, Instant.parse("1987-05-23T23:45:21Z"), 3));

		List<ClientDTO> list = service.findAll();
		
 		return ResponseEntity.ok().body(list);
 		
 	}
	
}
