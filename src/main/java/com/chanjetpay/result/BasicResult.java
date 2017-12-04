package com.chanjetpay.garlic.result;

/**
 * 无返回值结果
 * @author 李宝
 *
 */
public class BasicResult extends Result{

	private static final long serialVersionUID = 1L;
	
	public BasicResult(){
		this.setCode(Result.SUCCESS);
	}

	public static BasicResult newBasicResult() {
		return new BasicResult();
	}

	@Override
	public boolean isError() {
		return !Result.SUCCESS.equals(this.getCode());
	}
}
