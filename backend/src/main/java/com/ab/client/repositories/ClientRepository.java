package com.ab.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ab.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
