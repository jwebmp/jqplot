package com.jwebmp.plugins.jqplot.options.axis;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.plugins.jqplot.graphs.JQPlotBarGraph;
import com.jwebmp.plugins.jqplot.options.ticks.JQPlotTickOptionsAxisTick;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotAxisDateRendererOptionsTest
{

	public JQPlotAxisDateRendererOptionsTest()
	{
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testDateOnAxis()
	{
		JQPlotBarGraph graph = new JQPlotBarGraph(Orientation.VERTICAL);
		JQPlotAxisOptions axis = new JQPlotAxisOptions(graph);

		JQPlotAxisDateRendererOptions dateRender = new JQPlotAxisDateRendererOptions(graph);

		axis.setRendererOptions(dateRender);
		axis.setMin(5);
		JQPlotTickOptionsAxisTick.class.cast(axis.getTickRendererOptions())
		                               .setFormatString("%b %#d, %#I %p");

		System.out.println(axis);
	}

}
