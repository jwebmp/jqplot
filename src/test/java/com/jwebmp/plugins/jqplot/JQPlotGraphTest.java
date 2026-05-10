package com.jwebmp.plugins.jqplot;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.plugins.jqplot.graphs.JQPlotBarGraph;
import com.jwebmp.plugins.jqplot.graphs.display.JQPlotBar;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQPlotGraphTest
{

	public JQPlotGraphTest()
	{
	}

	@Test
	public void testStructure()
	{
		Page<?> p = new Page();
		
		p.getBody()
		 .add(new DivSimple<>().add(getNewGraph()));
		System.out.println(p.toString(true));
	}

	private JQPlotBarGraph getNewGraph()
	{
		JQPlotBarGraph graph = new JQPlotBarGraph(Orientation.VERTICAL);
		graph.setID("id");

		return graph;
	}

	@Test
	public void testDefaultOptions()
	{
		Page<?> p = new Page();
		p.setID("id");
		p.getBody()
		 .setID("body");

		JQPlotBarGraph graph = getNewGraph();
		graph.getOptions()
		     .getTitle()
		     .setText("1D Bar Graph");
		graph.getOptions()
		     .getTitle()
		     .setShow(true);
		graph.getCss()
		     .getDimensions()
		     .setWidth(260);

		graph.getOptions()
		     .setAnimate(Boolean.TRUE);
		graph.addBar(new JQPlotBar("Cat 1", 12.0));
		graph.addBar(new JQPlotBar("Cat 2", 14.0));
		graph.addBar(new JQPlotBar("Cat 3", 36.0));
		graph.addBar(new JQPlotBar("Cat 4", 94.0));

		graph.getOptions()
		     .getSeriesDefaults()
		     .getPointLabels()
		     .setShow(Boolean.TRUE);
		graph.getOptions()
		     .getHighlighter()
		     .setShow(true);
		p.getBody()
		 .add(new DivSimple<>().add(graph));

		System.out.println(p.toString(true));
	}

	@Test
	public void getMultipleCategoryBarGraph()
	{
		Page<?> p = new Page();
		p.setID("id");
		p.getBody()
		 .setID("body");

		JQPlotBarGraph graph = getNewGraph();
		graph.getOptions()
		     .setAnimate(Boolean.TRUE);
		graph.getCss()
		     .getDimensions()
		     .setWidth(460);

		graph.addBar(new JQPlotBar("Cat 1", 12.0));
		graph.addBar(new JQPlotBar("Cat 1", 94.0));
		graph.addBar(new JQPlotBar("Cat 1", 65.0));
		graph.addBar(new JQPlotBar("Cat 1", 46.0));

		graph.addBar(new JQPlotBar("Cat 2", 14.0));
		graph.addBar(new JQPlotBar("Cat 2", 36.0));
		graph.addBar(new JQPlotBar("Cat 2", 96.0));
		graph.addBar(new JQPlotBar("Cat 2", 107.0));

		graph.addBar(new JQPlotBar("Cat 3", 17.0));
		graph.addBar(new JQPlotBar("Cat 3", 33.0));
		graph.addBar(new JQPlotBar("Cat 3", 8.0));
		graph.addBar(new JQPlotBar("Cat 3", 26.0));

		graph.addBar(new JQPlotBar("Cat 4", 11.0));
		graph.addBar(new JQPlotBar("Cat 4", 52.0));
		graph.addBar(new JQPlotBar("Cat 4", 78.0));
		graph.addBar(new JQPlotBar("Cat 4", 69.0));

		//graph.getOptions().getSeriesDefaults().getPointLabels().setShow(Boolean.TRUE);
		graph.getOptions()
		     .getHighlighter()
		     .setShow(true);
		
		p.getBody()
		 .add(new DivSimple<>().add(graph));

		System.out.println(p.toString(true));

	}

}
