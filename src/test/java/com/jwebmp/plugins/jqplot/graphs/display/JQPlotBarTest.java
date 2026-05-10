package com.jwebmp.plugins.jqplot.graphs.display;

import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotBarTest
{

	public JQPlotBarTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		System.out.println("1D Bar");
		JQPlotBar bar = new JQPlotBar("Cat 1", 14.0);
		System.out.println(bar);

		System.out.println("2D Bar");
		bar = new JQPlotBar("Cat 1", "Cluster Bar 1", 1.0);
		JQPlotBar bar2 = new JQPlotBar("Cat 1", "Cluster Bar 2", 1.0);
		System.out.println(bar);
		System.out.println(bar2);

		System.out.println("Waterfall");
		bar = new JQPlotBar("Cat 1", 14.0, 19.0);
		System.out.println(bar);

		System.out.println("Waterfall clustered");
		bar = new JQPlotBar("XAxis", "Cluster Waterfall 1", 15.0, 28.0);
		bar2 = new JQPlotBar("XAxis", "Cluster Waterfall 2", 2.0, 13.0);

		System.out.println(bar);
		System.out.println(bar2);
	}

}
