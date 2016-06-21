package com.niit.shoppingcart.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
  public boolean isValidUser(String name,String password)
  {
  if(name.equals("niit") && password.equals("12345"))
  {
	  return true;
	  
  }
  else
  {
	  return false;
  }
  
}
}
