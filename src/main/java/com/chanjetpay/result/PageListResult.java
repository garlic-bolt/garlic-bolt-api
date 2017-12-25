package com.chanjetpay.result;

import com.chanjetpay.paging.Pagination;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}
}
