package com.theus.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.theus.dsvendas.dto.SaleSucessDTO;
import com.theus.dsvendas.dto.SaleSumDTO;
import com.theus.dsvendas.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long>{
	

	
	@Query("SELECT new com.theus.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller")	
	List<SaleSumDTO> amountGroupedBySeller();


	@Query("SELECT new com.theus.dsvendas.dto.SaleSucessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller")
	
	List<SaleSucessDTO> sucessGroupBySeller();
	

}

