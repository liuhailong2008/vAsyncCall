package com.dragonberg.asynccall.client;

/**
 * 异步调用异常。
 * 
 * @author liuhailong_1982@qq.com
 */
public class AsyncCallException extends RuntimeException {
	
	public AsyncCallException(String msg){
		super(msg);
	}
	
	public AsyncCallException(Exception e){
		super(e);
	}
	
	public AsyncCallException(String msg, Exception e){
		super(msg,e);
	}
	
	private static final long serialVersionUID = -6205161856682900033L;

}
