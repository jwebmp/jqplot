package com.jwebmp.plugins.jqplot.graphs.display;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotLineTest
{

	public JQPlotLineTest()
	{
	}

	@Test
	public void testBasicPlotline()
	{
		JQPlotLine pl = new JQPlotLine(1);
		System.out.println(pl);
		Assertions.assertEquals(pl.toString(), "[[0,1.0]]");

		pl.addPoint(2);
		System.out.println(pl);
		Assertions.assertEquals(pl.toString(), "[[0,1.0], [1,2.0]]");

		pl.addPoint("X", 1);
		System.out.println(pl);
		Assertions.assertEquals(pl.toString(), "[[0,1.0], [1,2.0], ['X',1.0]]");

	}

}
