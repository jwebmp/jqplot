package com.jwebmp.plugins.jqplot.graphs;

import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.graphs.display.JQPlotLine;
import com.jwebmp.plugins.jqplot.options.JQPlotOptions;

import java.util.ArrayList;
import java.util.List;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * The line graph implementation
 *
 * @param <J>
 *
 * @author mmagon
 * @since 2014/07/08
 */
@ComponentInformation(name = "Line Graph",
		description = "The most basic jqPlot chart takes a series of data and plots a line. No options need to be supplied. Data is passed in as an array of series. A series can be either an array of y values or an array of [x,y] data pairs. If y values only, x values are assigned like 1, 2, 3, ... Note, for this plot you don't need any plugins.",
		url = "http://www.jqplot.com/examples/line-charts.php")
public class JQPlotLineGraph<J extends JQPlotLineGraph<J>>
		extends JQPlotGraph<JQPlotOptions<?>, J>
{
	private List<JQPlotLine> plotLines;

	/**
	 * The plot line graph
	 */
	public JQPlotLineGraph()
	{
		//Nothing Needed
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 *
	 * @param xyValues
	 * 		An array of x,y values continual
	 */
	public void addLine(double... xyValues)
	{
		JQPlotLine newLine = new JQPlotLine(JQPlotLine.buildFromArray(xyValues));
		getPlotLines().add(newLine);
	}

	/**
	 * Returns the plot lines on this graph
	 *
	 * @return
	 */
	public List<JQPlotLine> getPlotLines()
	{
		if (plotLines == null)
		{
			plotLines = new ArrayList<>();
		}
		return plotLines;
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 *
	 * @param xyValues
	 * 		An array of x,y values continual
	 */
	public void addLine(Object[] xyValues)
	{
		JQPlotLine newLine = new JQPlotLine(JQPlotLine.buildFromArray(xyValues));
		getPlotLines().add(newLine);
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 *
	 * @param xyValues
	 * 		A string of x,y coordinates
	 */
	public void addLine(String xyValues)
	{
		JQPlotLine newLine = new JQPlotLine(JQPlotLine.buildFromDelimiteredSrting(xyValues, STRING_COMMNA));
		getPlotLines().add(newLine);
	}

	/**
	 * Each line should consist of data-points in the form of x,y,x,y,x,y,x,y
	 *
	 * @param newLine
	 * 		A new line to add
	 */
	public void addLine(JQPlotLine newLine)
	{

		getPlotLines().add(newLine);
	}

	@Override
	public StringBuilder getDataPointRender()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (JQPlotLine plotLine : getPlotLines())
		{
			sb.append(plotLine)
			  .append(STRING_COMMNA);
		}
		sb = sb.deleteCharAt(sb.lastIndexOf(STRING_COMMNA));
		sb.append("]");
		return sb;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
