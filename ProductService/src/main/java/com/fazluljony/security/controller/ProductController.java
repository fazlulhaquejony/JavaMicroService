package com.fazluljony.security.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fazluljony.security.model.Cupon;
import com.fazluljony.security.model.Product;
import com.fazluljony.security.repository.ProductDao;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("{cuponService.url}")
	private String cuponServiceUrl;
	
	@PostMapping("/productsave")
	public Product create(@RequestBody Product product)
	{
		Cupon cupon = restTemplate.getForObject(cuponServiceUrl + product.getCuponCode(), Cupon.class);
		product.setPrice(product.getPrice().subtract(cupon.getDiscount()));
		return productDao.save(product);
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(long id)
	{
		return productDao.getById(id);
	}
	
	public Product SendErrorResponse(Product product)
	{
		return product;
		
	}
}
