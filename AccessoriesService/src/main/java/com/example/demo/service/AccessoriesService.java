package com.example.demo.service;

import com.example.demo.service.model.*;

public interface AccessoriesService {
	
	void sellForDogFromStore(String id);
	
	int getAccessoryPrice(String id);
	
	Accessory takeInStore(Type type, Color color, int price);
	
	String forDogsReport();
	
	Accessory getForDogById(String id);
}
