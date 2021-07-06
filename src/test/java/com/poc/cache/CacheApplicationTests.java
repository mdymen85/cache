package com.poc.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CacheApplicationTests {

	@Autowired
	private AddressService addressService;
	
	@Test
	void testingCache() {
		
		this.addressService.getAddress("10 de Setembro");
		this.addressService.getAddress("10 de Setembro");
		this.addressService.getAddress("14 de Dezembro");
		
	}

}
