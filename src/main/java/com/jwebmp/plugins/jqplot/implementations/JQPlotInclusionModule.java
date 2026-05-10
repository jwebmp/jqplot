package com.jwebmp.plugins.jqplot.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class JQPlotInclusionModule implements IGuiceScanModuleInclusions<JQPlotInclusionModule>
{
	@Override
	public Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqplot");
		return set;
	}
}
