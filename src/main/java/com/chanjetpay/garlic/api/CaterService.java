package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.DishDto;

import java.util.List;

/**
 * 餐饮服务
 */
public interface CaterService {

	/**
	 * 增加餐品类型
	 * @param mealTypes
	 */
	void submitMealType(List<String> mealTypes);

	/**
	 * 查询商户餐饮类型
	 * @param merchantCode 商户号
	 * @return 餐品类型-中餐，西餐，火锅
	 */
	List<String> queryMealTypes(String merchantCode);

	/**
	 * 提交菜品
	 * @param merchantCode 商户号
	 * @param dish 菜品
	 * @return 菜品编号
	 */
	String submitDish(String merchantCode, DishDto dish);




	/**
	 * 预约排队
	 * @param merchantCode 商户号
	 * @param mealType 餐饮类型
	 * @param numbers 人数
	 * @return 序号 serial
	 */
	Integer reserve(String merchantCode, String mealType, String numbers);

	/**
	 * 根据序号查询前面等候人数
	 * @param merchantCode
	 * @param serial
	 * @return
	 */
	Integer queryCount(String merchantCode, String serial);

	/**
	 * 序号通过
	 * @param merchantCode
	 * @param serial
	 */
	void pass(String merchantCode, String serial);




	//点餐

	//结账

	//发票
}
