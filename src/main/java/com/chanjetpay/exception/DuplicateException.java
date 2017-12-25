package com.chanjetpay.exception;

public class DuplicateException extends BaseException {
	private static final long serialVersionUID = -3831140872544101914L;

	public DuplicateException(String defineCode, String defineDesc) {
		super(defineCode, defineDesc);
	}

	public static final String FOUND_MULTI_RECORD = "2001";
}
