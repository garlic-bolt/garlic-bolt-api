package com.chanjetpay.garlic.dto;

import java.io.Serializable;

/**
 * 菜品
 */
public class DishDto implements Serializable{

	private static final long serialVersionUID = 1180246030833328105L;
	//菜品编号
	private Integer dishNo;
	//菜品名，菜品描述，菜品图片，食物类型-特色，推荐，热菜，凉菜，主食等
	private String dishName, dishDesc, dishPic, foodType;

	public Integer getDishNo() {
		return dishNo;
	}

	public void setDishNo(Integer dishNo) {
		this.dishNo = dishNo;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishDesc() {
		return dishDesc;
	}

	public void setDishDesc(String dishDesc) {
		this.dishDesc = dishDesc;
	}

	public String getDishPic() {
		return dishPic;
	}

	public void setDishPic(String dishPic) {
		this.dishPic = dishPic;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
}
