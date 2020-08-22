package com.black.gsk.Config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevProfileBean implements EnvBasedConfig {

	@Override
	public void setUp() {
		System.out.println("Dev Profile Active");
		
	}

}
