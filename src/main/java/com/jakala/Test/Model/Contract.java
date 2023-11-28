package com.jakala.Test.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Contract
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Userid")
	private User user;
	 
	private String contractType;
	private Date startDate ,endDate;
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}
	public String getContractType()
	{
		return contractType;
	}
	public void setContractType(String contractType)
	{
		this.contractType = contractType;
	}
	public Date getStartDate()
	{
		return startDate;
	}
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	public Date getEndDate()
	{
		return endDate;
	}
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	
	public boolean isValid() 
	{
		return
		contractType!= null		&&
		!contractType.isBlank()	&&
		startDate!= null		&&
		endDate!= null			&&
		startDate.before(endDate);
	}
}
