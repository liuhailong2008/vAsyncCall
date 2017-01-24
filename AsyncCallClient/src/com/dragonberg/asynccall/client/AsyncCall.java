package com.dragonberg.asynccall.client;

/**
 * <h2>异步调用客户端，入口</h2>
 * 
 * @author liuhailong_1982@qq.com
 *
 */
public class AsyncCall {
	
	/**
	 * <h3>根据配置信息获取AsyncCall实例</h3>
	 * 第一次获取后将缓存。<br />
	 * 如果需要重新获取需调用<code>AsyncCall.getInstance(true)</code>。
	 * 
	 * @return AsyncCall实例
	 */
	public static AsyncCallInvoker getInstance(){
		AsyncCallInvoker ret = getInstance(false);
		return ret;
	}
	/**
	 * <h3>根据配置信息获取AsyncCall实例</h3>
	 * FIXME 线程不安全
	 * 
	 * @param reload 重新获取
	 * @return
	 */
	public static AsyncCallInvoker getInstance(boolean reload){
		if(instanceCache!=null && !reload){
			return instanceCache;
		}
		AsyncCallInvoker instanceCache = getAsyncCallInstanceByConfig();
		return instanceCache;
	}
	protected static AsyncCallInvoker instanceCache = null;
	
	
	/**
	 * 根据配置信息获取
	 * @return
	 */
	private static AsyncCallInvoker getAsyncCallInstanceByConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
