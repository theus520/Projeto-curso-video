package com.theus.dsvendas.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.theus.dsvendas.dto.SaleDTO;
import com.theus.dsvendas.entities.Sale;
import com.theus.dsvendas.repositories.SaleRepository;
import com.theus.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	
	@Autowired
	private SellerRepository sellerRepository;
	
		
	// busca paginada apenas com o pageable 
	@Transactional
	public Page<SaleDTO> findAll(Pageable pageable ){
		sellerRepository.findAll();
	Page<Sale> result = repository.findAll(pageable);
	
	return result.map(x -> new SaleDTO(x));
	}
	

	
}
