package com.jwebmp.plugins.jqplot.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class JQPlotExclusionsModule
		implements IGuiceScanModuleExclusions<JQPlotExclusionsModule>
{
	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqplot");
		return strings;
	}
}
