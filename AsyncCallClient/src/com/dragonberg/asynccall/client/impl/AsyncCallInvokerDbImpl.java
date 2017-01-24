package com.dragonberg.asynccall.client.impl;

import com.dragonberg.asynccall.client.api.AsyncCallException;
import com.dragonberg.asynccall.client.api.AsyncCallInvoker;
import com.dragonberg.asynccall.client.api.IResult;

/**
 * 
 * @author liuhailong_1982@qq.com
 */
public class AsyncCallInvokerDbImpl implements AsyncCallInvoker {

	public String call(String id, String className, String method, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	public String invoke(String id, String className, String method, Class<? extends IResult> result,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object result(String id) throws AsyncCallException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Object result(String id, T returnType) throws AsyncCallException {
		// TODO Auto-generated method stub
		return null;
	}

}
