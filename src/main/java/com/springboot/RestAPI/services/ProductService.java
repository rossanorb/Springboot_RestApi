package com.springboot.RestAPI.services;

import java.util.List;

import com.springboot.RestAPI.models.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product find(Long id);
	public Product create(Product product);
	public Product update(Long id, Product product);
	public void delete(Long id);	
}
