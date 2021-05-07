package com.theus.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theus.dsvendas.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long>{
	

}
