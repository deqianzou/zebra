package com.dianping.zebra.filter;

/**
 * Created by Dozer on 9/2/14.
 */
public class FilterManagerFactory {

	/* 为什么这个工厂里会用单例呢 */
	public static FilterManager getFilterManager() {
		return FilterManagerHolder.filterManager;
	}

	private static class FilterManagerHolder {
		private volatile static FilterManager filterManager = new DefaultFilterManager();
		static {
			filterManager.init();
		}
	}
}
