package com.fazluljony.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazluljony.security.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {



}
