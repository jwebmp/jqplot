package com.jwebmp.plugins.jqplot.graphs.display;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * Container Class for Donut Pie Groupings
 *
 * @author GedMarc
 * @since 05 Mar 2016
 */
public class JQPlotDonutGroup
		extends JavaScriptPart<JQPlotDonutGroup>
{


	private List<List<JQPlotPieSlice>> donutGroup;

	/**
	 * The donut group
	 */
	public JQPlotDonutGroup()
	{
		//Nothing Needed
	}

	/**
	 * Returns a specific donut group. Rendered as [] in
	 *
	 * @return
	 */
	public List<List<JQPlotPieSlice>> getDonutGroup()
	{
		if (donutGroup == null)
		{
			donutGroup = new ArrayList<>();
		}
		return donutGroup;
	}

	/**
	 * Sets the specific donut group
	 *
	 * @param donutGroup
	 */
	public void setDonutGroup(List<List<JQPlotPieSlice>> donutGroup)
	{
		this.donutGroup = donutGroup;
	}

	public List<JQPlotPieSlice> getDonutGroupSlices(int groupNumber)
	{
		if (donutGroup == null)
		{
			donutGroup = new ArrayList<>();
			if (donutGroup.size() < groupNumber)
			{
				donutGroup.add(groupNumber, new ArrayList<>());
			}
		}
		return donutGroup.get(groupNumber);
	}

}
