package com.shaan.restfull.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shaan.restfull.bean.Country;
import com.shaan.restfull.dao.CountryDao;
import com.shaan.restfull.dao.impl.CountryDaoImpl;

@RestController
public class CountryController {

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		List<Country> listOfCountries = new ArrayList<Country>();
		CountryDao countyDao = new CountryDaoImpl();
		listOfCountries = countyDao.getCountryList();
		return listOfCountries;
	}

}
