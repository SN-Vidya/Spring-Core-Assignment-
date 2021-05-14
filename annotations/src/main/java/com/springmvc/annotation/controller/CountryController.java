package com.springmvc.annotation.controller;

	import com.springmvc.annotation.bean.Country;
	import com.springmvc.annotation.service.CountryService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	 
	@Controller ("countryController")
	public class CountryController 
	{
	     @Autowired
	    CountryService countryService;
	 
	    public Country createNewCountry()
	    {
	        return countryService.createNewCountry();
	    }
	}
	 


