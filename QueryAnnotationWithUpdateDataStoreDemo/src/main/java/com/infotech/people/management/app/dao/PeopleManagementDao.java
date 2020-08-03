package com.infotech.people.management.app.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.people.management.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Person SET email=:newEmail WHERE id=:personId")
	void updatePersonEmailById(@Param("personId") int id, 
								@Param("newEmail") String newEmail);

}
