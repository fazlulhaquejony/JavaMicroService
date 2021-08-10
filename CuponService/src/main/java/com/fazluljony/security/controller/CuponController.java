package com.fazluljony.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fazluljony.security.Dao.CuponDao;
import com.fazluljony.security.model.Cupon;

@RestController
@RequestMapping("/cuponapi")
public class CuponController {
	
	@Autowired
	private CuponDao cupondao;
	
	@PostMapping("/cuponsave")
	public Cupon create(Cupon cupon)
	{
		return cupondao.save(cupon);
	}
	
	@GetMapping("/cupon/{code}")
	public Cupon getCupon(String code)
	{
		return cupondao.findByCode(code);
		
	}

}
