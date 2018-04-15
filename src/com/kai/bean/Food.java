package com.kai.bean;

import java.io.Serializable;

public class Food implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private Long id;//id
	private String name;//食物名称
	private Double price;//食物价格
	private String url;//食物图片
	private String burdenMessage;//配料信息
	private String foodMessage;//食物介绍
	private Long k_id; //种类id
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(Long id, String name, Double price, String url, String burdenMessage, String foodMessage,Long k_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.k_id = k_id;
		this.url = url;
		this.burdenMessage = burdenMessage;
		this.foodMessage = foodMessage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getK_id() {
		return k_id;
	}

	public void setK_id(Long k_id) {
		this.k_id = k_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBurdenMessage() {
		return burdenMessage;
	}

	public void setBurdenMessage(String burdenMessage) {
		this.burdenMessage = burdenMessage;
	}

	public String getFoodMessage() {
		return foodMessage;
	}

	public void setFoodMessage(String foodMessage) {
		this.foodMessage = foodMessage;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
