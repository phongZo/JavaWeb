package com.laptrinhweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category") 
public class CategoryEntity extends AbstractEntity {
	@OneToMany(mappedBy="categoryEntity")
    private List<ProductEntity> products;
	
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
		
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ProductEntity> getProducts() {
		return products;
	}
	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
	
}
