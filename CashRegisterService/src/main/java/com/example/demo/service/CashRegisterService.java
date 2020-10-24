package com.example.demo.service;

import com.example.demo.service.model.CashRegister;

public interface CashRegisterService {
	
	//String cashiersReport();
	
	String cashRegistersReport();
	
	//void deleteCashierById(String id);
	
	//Cashier getCashierById(String id);
	
	void deleteCashRegisterById(String id);
	
	CashRegister getCashRegisterById(String id);
	
	//Cashier createCashier(String name);
	
	void addCash(String id, int amountOfCash);
	
	CashRegister createCashRegister(String name, int amountOfCash);
		
	CashRegister getCashRegister(CashRegister cashReg);
	
	int getAmountOfCash(CashRegister cashReg);
}
