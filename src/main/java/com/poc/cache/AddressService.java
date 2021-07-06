package com.poc.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	Logger log = LoggerFactory.getLogger(AddressService.class);
	
	@Cacheable(cacheNames="address", key="#street")
	public Address getAddress(String street) {
		log.info("Address {}", street);
		return new Address(street);
	}
	
}
