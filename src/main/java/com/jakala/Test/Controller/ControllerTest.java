package com.jakala.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jakala.Test.Repository.ContractRepository;
import com.jakala.Test.Repository.UserRepository;


@RestController
public class ControllerTest
{
	@Autowired
	UserRepository UserRepo;
	@Autowired
	ContractRepository ContractRepo;
	
	
}
