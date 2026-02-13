package com.mycorp.product_app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycorp.product_app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
