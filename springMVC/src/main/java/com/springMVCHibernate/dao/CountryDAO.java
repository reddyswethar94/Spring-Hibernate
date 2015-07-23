package com.springMVCHibernate.dao;
import java.util.List;
import com.springMVCHibernate.form.Country;

public interface CountryDAO {

	 public void addCountry(Country country); 
	    public List<Country> listCountry();
	    public void removeCountry(Integer countryid);
}
