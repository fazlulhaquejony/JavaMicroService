package com.fazluljony.security.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fazluljony.security.model.Cupon;

@Repository
public interface CuponDao extends JpaRepository<Cupon, Long> {

	Cupon findByCode(String code);

}
