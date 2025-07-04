package com.kubernate.Kubernates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubernate.Kubernates.model.Product;
import com.kubernate.Kubernates.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		String res=productService.saveProduct(product);
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> res=productService.findAllProduct();
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
