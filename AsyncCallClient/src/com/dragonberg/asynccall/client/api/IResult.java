package com.dragonberg.asynccall.client.api;

public interface IResult {
	/**
	 * 接收异步调用返回结果。
	 * 
	 * @param id
	 * @param result
	 * @param e
	 */
	public void result(String id, Object result, Throwable e);
}
