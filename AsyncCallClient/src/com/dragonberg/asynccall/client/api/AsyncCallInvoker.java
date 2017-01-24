package com.dragonberg.asynccall.client.api;
/**
 * <h2>异步调用器</h2>
 * 
 * @author liuhailong_1982@qq.com
 */
public interface AsyncCallInvoker {
	
	
	/**
	 * 发起异步调用。
	 * 
	 * @param id 将来用于取回调用结果
	 * @param className
	 * @param method
	 * @param params
	 * @return 将来用于取回调用结果，如果id不为空且唯一，则为id
	 */
	public abstract String call(String id, String className,String method,Object...params);
	
	/**
	 * 发起异步调用。
	 * 
	 * @param id 将来用于取回调用结果
	 * @param className
	 * @param method
	 * @param result
	 * @param params
	 * @return 将来用于取回调用结果，如果id不为空且唯一，则为id
	 */
	public abstract String invoke(String id, String className,String method,Class<? extends IResult> result,
			Object...params);
	
	/**
	 * 定时取回取回调用结果。
	 * 
	 * @param token
	 * @return
	 * @throws AsyncCallException
	 */
	public abstract Object result(String id) throws AsyncCallException ;
	/**
	 * 定时取回取回调用结果。
	 * 
	 * @param id
	 * @param returnType
	 * @return
	 * @throws AsyncCallException
	 */
	public abstract <T> Object result(String id,T returnType) throws AsyncCallException ;
}
