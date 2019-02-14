package org.jboss.resteasy.test.providers.jackson;

import java.util.HashSet;
import java.util.Set;

import org.jboss.resteasy.spi.ResteasyConfiguration;

public class TestResteasyConfiguration implements ResteasyConfiguration {

	public boolean jsonpEnabled = false;
	
	@Override
	public String getParameter(String name) {
		if ("resteasy.jsonp.enable".equals(name)) {
			return String.valueOf(jsonpEnabled);
		}
		return null;
	}

	@Override
	public Set<String> getParameterNames() {
		Set<String> params = new HashSet<String>();
		params.add("resteasy.jsonp.enable");
		return params;
	}

	@Override
	public String getInitParameter(String name) {
		return this.getParameter(name);
	}

	@Override
	public Set<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
