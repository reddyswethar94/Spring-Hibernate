package com.springMVCHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.springMVCHibernate.dao.CountryDAO;
import com.springMVCHibernate.form.Country;

public class CountryServiceImpl implements CountryService {
	
	 @Autowired
	    private CountryDAO countryDAO;
	     
	    @Transactional
	    public void addCountry(Country country) {
	        countryDAO.addCountry(country);
	    }
	 
	    @Transactional
	    public List<Country> listCountry() {
	 
	        return countryDAO.listCountry();
	    }
	 
	    @Transactional
	    public void removeCountry(Integer countryid) {
	        countryDAO.removeCountry(countryid);
	    }

}
