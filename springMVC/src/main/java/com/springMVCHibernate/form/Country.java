package com.springMVCHibernate.form;

import javax.persistence.*;

@Entity
@Table(name="country")

public class Country {

	@Id
    @Column(name="country_id")
    @GeneratedValue
    private Integer countryid;
     
    @Column(name="country_name")
    private String countryname;

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
    
    
}
