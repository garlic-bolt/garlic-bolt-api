package com.chanjetpay.result;

import com.chanjetpay.garlic.result.ListResult;
import com.chanjetpay.paging.Pagination;

/**
 * 返回集合值分页结果
 * @author 李宝
 *
 * @param <T>
 */
public class PageListResult<T> extends ListResult<T> {

	private static final long serialVersionUID = 1L;
	
	public static <E> PageListResult<E> newPageListResult() {
		return new PageListResult<E>();
	}
	
	/**
	 * @return 辅助分页查询结果
	 */
	private Pagination pagination;

	public Pagination getPagination() {
		return pagination;
	}

	public PageListResult<T> setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}
}
