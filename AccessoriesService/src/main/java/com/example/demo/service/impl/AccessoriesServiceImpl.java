package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.AccessoriesService;
import com.example.demo.service.model.*;
import com.example.demo.service.repository.AccessoriesRepo;


@Service
public class AccessoriesServiceImpl implements AccessoriesService{
	private final AccessoriesRepo accessoriesRepo;
	
	@Autowired
	AccessoriesServiceImpl(AccessoriesRepo accessoriesRepo){
		this.accessoriesRepo = accessoriesRepo;
	}
	
	@Override
	public int getAccessoryPrice(String id) {
		Accessory accessory = accessoriesRepo.findById(id).get();
		return accessory.getPrice();
	}

	@Override
	public void sellForDogFromStore(String id) {
		accessoriesRepo.delete(getForDogById(id));
	}
	
	@Override
	public Accessory getForDogById(String id) {
        return accessoriesRepo.findById(id).get();
    }
	
	@Override
	public Accessory takeInStore(Type type, Color color, int price) {
		Accessory forDog = new Accessory(type, color, price);
		accessoriesRepo.save(forDog);
		return forDog;
	}
	
	@Override
	public String forDogsReport() {   
		List<Accessory> accessories=(List<Accessory>)accessoriesRepo.findAll();

        System.out.println("ForDogs REPORT:");
        String report = "";
        
        for(Accessory accessory : accessories) {
        	System.out.println(accessory);
            report += accessory + "\n";
        }

        return report;
    }
}
