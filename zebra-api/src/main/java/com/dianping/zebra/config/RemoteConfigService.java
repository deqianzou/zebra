package com.dianping.zebra.config;

import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoteConfigService implements ConfigService {

	private List<PropertyChangeListener> listeners = new CopyOnWriteArrayList<PropertyChangeListener>();

	private RemoteConfigService() {
	}

	public static RemoteConfigService getInstance() {
		return ConfigServiceHolder.configService;
	}

	private static class ConfigServiceHolder {
		private static RemoteConfigService configService = new RemoteConfigService();
		static {
			ConfigServiceHolder.configService.init();
		}
	}

	//TODO customize this method to get config from remote
	@Override
	public String getProperty(String key) {
		return null;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		listeners.remove(listener);
	}

	//TODO customize this method
	@Override
	public void init() {
	}

	//TODO customize this method
	@Override
	public void destroy() {
	}
}
