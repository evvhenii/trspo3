package com.example.demo.service.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@Entity
@EnableAutoConfiguration
public final class Accessory{
	
	@Id
	private String forDogId;
	private Type type;
	private Color color;
	private int price;

	public Accessory() {}
	
	public Accessory(Type type, Color color, int price){
		this.forDogId = UUID.randomUUID().toString();
		this.type = type;
		this.color = color;
		this.price = price;
	}
	
	public String getForDogId() {
		return forDogId;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return type + " " + color + ". PRICE: " + price + "Hryvnia. ID " + forDogId;
	}

}
