package com.jwebmp.plugins.jqplot.graphs;

import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotDonutGraphTest
{

	public JQPlotDonutGraphTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		JQPlotDonutGraph graph = new JQPlotDonutGraph();
		//graph.addSlice(0, "Name 1", 0);

		double line[] = new double[]
				                {
						                7, 13.3, 14.7, 5.2, 1.2
				                };
		double line2[] = new double[]
				                 {
						                 7, 13.3, 14.7, 5.2, 1.2
				                 };

		graph.addSlices(0, line);
		graph.addSlices(1, line2);

		System.out.println(graph.toString(true));

		System.out.println(graph.toString(true));
		System.out.println(graph.renderJavascriptAll());
	}

}
