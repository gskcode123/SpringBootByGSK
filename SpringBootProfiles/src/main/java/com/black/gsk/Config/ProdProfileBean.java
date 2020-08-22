package com.black.gsk.Config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdProfileBean implements EnvBasedConfig{

	@Override
	public void setUp() {
		System.out.println("Prod Profile active");
		
	}

}
