package com.springMVCHibernate.service;

import java.util.List;

import com.springMVCHibernate.form.Country;

public interface CountryService {

	public void addCountry(Country country);
    public List<Country> listCountry();
    public void removeCountry(Integer countryid);
}
