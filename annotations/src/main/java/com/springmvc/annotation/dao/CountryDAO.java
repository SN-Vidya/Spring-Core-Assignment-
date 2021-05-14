package com.springmvc.annotation.dao;
import com.springmvc.annotation.bean.Country;
import org.springframework.stereotype.Repository;
 
@Repository("countryDAO")
public class CountryDAO {
 
 public Country createNewCountry() {
 
  Country country = new Country("Ïndia", 40000);
  return country;
 }
 
}

