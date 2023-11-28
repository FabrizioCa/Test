package com.jakala.Test.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jakala.Test.Model.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract,Integer>
{
	List<Contract> findByStartDate(Date startDate);
	List<Contract> findByContractType(String contractType);
}
