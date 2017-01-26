package com.shaan.restfull.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.shaan.restfull.bean.Country;
import com.shaan.restfull.dao.CountryDao;

public class CountryDaoImpl implements CountryDao{

	public List<Country> getCountryList() {
		  Country indiaCountry=new Country(1, "India");  
		  Country chinaCountry=new Country(4, "China");  
		  Country nepalCountry=new Country(3, "Nepal");  
		  Country bhutanCountry=new Country(2, "Bhutan");  
		  
		  List<Country> listOfCountries = new ArrayList<Country>();  
		  listOfCountries.add(indiaCountry);  
		  listOfCountries.add(chinaCountry);  
		  listOfCountries.add(nepalCountry);  
		  listOfCountries.add(bhutanCountry); 
		  
		  return listOfCountries;
	}
	

}
