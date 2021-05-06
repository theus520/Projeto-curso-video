package com.theus.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theus.dsvendas.entities.Seller;

public interface SellerRepository  extends JpaRepository<Seller, Long>{
	

}
