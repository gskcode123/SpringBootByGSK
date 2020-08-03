package com.infotech.people.management.app.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.infotech.people.management.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {
	
	@Async 
	CompletableFuture<Person> findByEmail(String email);
	
	

}
