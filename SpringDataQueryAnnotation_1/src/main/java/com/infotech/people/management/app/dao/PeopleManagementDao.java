package com.infotech.people.management.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.infotech.people.management.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {
	@Query(value = "SELECT p FROM Person p WHERE p.lastName=?1")
	List<Person> findBylastNamePersonInfo(String lastName);
	
	@Query(value = "SELECT p FROM Person p WHERE p.firstName=?1 AND p.email=?2")
	List<Person> getfindByFirstNameAndEmail(String firstName,String email);
	

}
