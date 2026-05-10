package com.jwebmp.plugins.jqplot.options;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.plugins.jqplot.graphs.JQPlotBarGraph;
import com.jwebmp.plugins.jqplot.graphs.display.JQPlotBar;
import com.jwebmp.plugins.jqplot.options.series.JQPlotSeriesBarOptions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotOptionsTest
{

	public JQPlotOptionsTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		JQPlotBarGraph<?> graph = new JQPlotBarGraph(Orientation.VERTICAL);

		graph.addBar("meh", 1.0);
		graph.addBar(new JQPlotBar("1", "Cat 2", 14.0));
		graph.addBar(new JQPlotBar("2", "Cat 3", 36.0));
		graph.addBar(new JQPlotBar("3", "Cat 4", 94.0));

		//graph.preRenderTest();
		//JQPlotOptions o = new JQPlotOptions(new JQPlotBarGraph(Orientation.HORIZONTAL));
		JQPlotOptions<?> o = graph.getOptions();
		o.getSeriesDefaults()
		 .setColors("123");
		o.setAnimate(true);
		o.getSeriesDefaults()
		 .setRendererOptions(new JQPlotSeriesBarOptions<>(graph));
		o.getSeriesDefaults()
		 .getPointLabels()
		 .setShow(true);

		//  System.out.println(o);
		System.out.println(graph.renderJavascriptAll());
	}

	@Test
	public JQPlotBarGraph multiBar()
	{
		JQPlotBarGraph graph = graph = new JQPlotBarGraph<>(Orientation.VERTICAL);
		graph.getOptions()
		     .setAnimate(Boolean.TRUE);
		graph.getCss()
		     .getDimensions()
		     .setWidth(460);

		graph.addBar(new JQPlotBar("1", "Cat 1", 12.0));
		graph.addBar(new JQPlotBar("1", "Cat 1", 94.0));
		graph.addBar(new JQPlotBar("1", "Cat 1", 65.0));
		graph.addBar(new JQPlotBar("1", "Cat 1", 46.0));

		graph.addBar(new JQPlotBar("1", "Cat 2", 14.0));
		graph.addBar(new JQPlotBar("1", "Cat 2", 36.0));
		graph.addBar(new JQPlotBar("1", "Cat 2", 96.0));
		graph.addBar(new JQPlotBar("1", "Cat 2", 107.0));

		graph.addBar(new JQPlotBar("1", "Cat 3", 17.0));
		graph.addBar(new JQPlotBar("1", "Cat 3", 33.0));
		graph.addBar(new JQPlotBar("1", "Cat 3", 8.0));
		graph.addBar(new JQPlotBar("1", "Cat 3", 26.0));

		graph.addBar(new JQPlotBar("1", "Cat 4", 11.0));
		graph.addBar(new JQPlotBar("1", "Cat 4", 52.0));
		graph.addBar(new JQPlotBar("1", "Cat 4", 78.0));
		graph.addBar(new JQPlotBar("1", "Cat 4", 69.0));

		//graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
		graph.getOptions()
		     .getHighlighter()
		     .setShow(true);
		return graph;

	}
}
