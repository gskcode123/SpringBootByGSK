package com.black.gsk;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.black.gsk.Config.EnvBasedConfig;

@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner{

	@Autowired
	private javax.sql.DataSource dataSource;
	
	@Autowired
	private EnvBasedConfig envBasedConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DataSource=" + dataSource);
		
		System.out.println("--------------------------------");
		envBasedConfig.setUp();
		
	}

}
