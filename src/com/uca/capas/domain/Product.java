package com.uca.capas.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {

	@NotEmpty
	@Size(max = 30)
	private String name;
	@NotEmpty
	@Size(max = 30)
	private String brand;
	@NotEmpty
	@Size(max = 30)
	private String description;
	@NotEmpty
	@Size(max = 30)
	private String category;
	@NotNull
	@Min(value=0)
	private BigDecimal price;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String marca) {
		this.brand = marca;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
