package com.chanjetpay.result;

import com.chanjetpay.result.Result;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/***
 * 返回集合值结果
 * @author 李宝
 *
 * @param <T>
 */
public class ListResult<T> extends Result {

	private static final long serialVersionUID = 1L;
	
	public ListResult(){
		this.setCode(Result.SUCCESS);
	}
	
	public static <E> ListResult<E> newListResult() {
		return new ListResult<E>();
	}
	
	/**
	 * 集合值结果
	 */
	private List<T> values;

	public List<T> getValues() {
		return values;
	}

	public ListResult<T> setValues(List<T> values) {
		this.values = values;
		return this;
	}

	@Override
	public boolean isError() {
		return !Result.SUCCESS.equals(this.getCode());
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE, true, true);
	}
}
