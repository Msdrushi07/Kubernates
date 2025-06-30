package com.kubernate.Kubernates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.kubernate.Kubernates.model.Product;
import com.kubernate.Kubernates.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public String saveProduct(Product product) {
		productRepo.save(product);
		return "product saved successfully";
	}
	
	public List<Product> findAllProduct(){
		return productRepo.findAll();
	}

}
