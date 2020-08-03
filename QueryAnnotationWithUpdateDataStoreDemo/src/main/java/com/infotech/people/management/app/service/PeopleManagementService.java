package com.infotech.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public void updatePersonEmailById(int id, String newEmail) {
		// TODO Auto-generated method stub
		peopleManagementDao.updatePersonEmailById(id,newEmail);
		
	}

}
