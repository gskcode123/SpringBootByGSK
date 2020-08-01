package com.infotech.people.management.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.people.management.app.entities.Person;
import com.infotech.people.management.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createPerson();
		//createPersons();
		//getPersonByIds();
		//deletePersonEntity();
		updatePersonEmailById();
		
		
	}

	private void updatePersonEmailById() {
		peopleManagementService.updatePersonEailById(2,"gopiprajapat9024@gmail.com");
		
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(3);
		peopleManagementService.deletePersonEntity(person);
		
	}

	private void getPersonByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(2);
		ids.add(3);
		ids.add(4);
		Iterable<Person> personList = peopleManagementService.getPersonByIds(ids);
		personList.forEach(System.out::println);
		
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("gopi", "Prajapat", "gopi@gmail.com", new Date()),
				new Person("Sita", "Prajapat", "sita@gmail.com", new Date()));
		Iterable<Person> createPersons =  peopleManagementService.createPersons(personList);
		for (Person person : createPersons) {
			System.out.println(person);
		}
		// TODO Auto-generated method stub
		
	}

	private void createPerson() {
		Person person1 = new Person("ganesh", "Prajapat", "ganeshmrr12@gmail.com", new Date());
		Person persondb = peopleManagementService.createPerson(person1);
		System.out.println(persondb);
	}

}
