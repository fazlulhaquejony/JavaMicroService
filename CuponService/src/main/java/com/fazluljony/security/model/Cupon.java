package com.fazluljony.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cupon")
public class Cupon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public long id;
	@Column(name="code")
	public String code;
	@Column(name="discount")
	public double discount;
	@Column(name="exp_date")
	public String exp_date;
	
	
	public Cupon()
	{
		
	}


	public Cupon(long id, String code, double discount, String exp_date) {
		super();
		this.id = id;
		this.code = code;
		this.discount = discount;
		this.exp_date = exp_date;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public String getExp_date() {
		return exp_date;
	}


	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}


	@Override
	public String toString() {
		return "Cupon [id=" + id + ", code=" + code + ", discount=" + discount + ", exp_date=" + exp_date + "]";
	}
	
	
	

}
