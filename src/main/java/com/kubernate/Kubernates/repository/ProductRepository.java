package com.kubernate.Kubernates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kubernate.Kubernates.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
