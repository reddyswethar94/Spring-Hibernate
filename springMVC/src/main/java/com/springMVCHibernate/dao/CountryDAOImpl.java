package com.springMVCHibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMVCHibernate.form.Country;

@Repository
public abstract class CountryDAOImpl implements CountryDAO {

	  @Autowired
	    private SessionFactory sessionFactory;
	 
	    public void addCountry(Country country) {
	        sessionFactory.getCurrentSession().save(country);
	    }
	 
	    @SuppressWarnings("unchecked")
		public List<Country> listContact() {
	 
	        return sessionFactory.getCurrentSession().createQuery("from Country")
	                .list();
	    }
	 
	    public void removeCountry(Integer countryid) {
	        Country country = (Country) sessionFactory.getCurrentSession().load(
	                Country.class, countryid);
	        if (null != country) {
	            sessionFactory.getCurrentSession().delete(country);
	        }
	    }

		
}
