package com.jwebmp.plugins.jqplot.graphs;

import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotLineGraphTest
{

	public JQPlotLineGraphTest()
	{
	}

	@Test
	public void testVeryBasic()
	{

		JQPlotLineGraph graph = new JQPlotLineGraph();
		graph.getOptions()
		     .getTitle()
		     .setText("Line Graph");
		graph.addLine("0,1,1,2,3,4,5,6,7,8,9,10");
		graph.addLine("0,1,1,2,3,4,5,6,7,8,9,10");

		System.out.println(graph.renderJavascriptAll());

	}

}
