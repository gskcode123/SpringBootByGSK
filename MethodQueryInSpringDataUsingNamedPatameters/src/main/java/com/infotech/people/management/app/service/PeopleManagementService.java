package com.infotech.people.management.app.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> findByLastNameOrFirstName(String lastName, String firstName) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findByLastNameOrFirstName(lastName,firstName);
	}
	

	

	

}
