package com.jakala.Test.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name, surname, userType;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getUserType()
	{
		return userType;
	}

	public void setUserType(String userType)
	{
		this.userType = userType;
	}
	
	public boolean isValid() 
	{
		return
		name!=null  			&&
		!name.isBlank() 		&&
		surname!=null  			&&
		!surname.isBlank() 		&&
		userType!=null			&&
		!userType.isBlank()		;

	}
	
}
