package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;

public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepo productrepo;

	@Override
	public List<Product> findallproduct() {
		// TODO Auto-generated method stub
		return (List<Product>) productrepo.findAll();
	}

	@Override
	public Product findByid(int id) {
		// TODO Auto-generated method stub
		return productrepo.findById(id).get();
	}

}
