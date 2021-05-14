package com.springmvc.annotation.service;
import com.springmvc.annotation.bean.Country;
import com.springmvc.annotation.dao.CountryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("countryService")
public class CountryService {
    @Autowired
 CountryDAO countryDAO;
 public Country createNewCountry() {
 
  return countryDAO.createNewCountry();
 }
 
}
 

