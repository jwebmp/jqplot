package com.jwebmp.plugins.jqplot.graphs.display;

import com.jwebmp.core.generics.XYObject;

/**
 * A slice of a JQ Plot Pie
 *
 * @author GedMarc
 * @since 01 Mar 2016
 */
public class JQPlotPieSlice
		extends XYObject<String, Double>
{


	/**
	 * A slice of the pie
	 *
	 * @param name
	 * @param value
	 */
	public JQPlotPieSlice(String name, double value)
	{
		super(name, value);

	}

	/**
	 * Return the name of the slice (or X)
	 *
	 * @return
	 */
	public String getName()
	{
		return getX();
	}

	/**
	 * Sets the name of the slice (or X)
	 *
	 * @param name
	 */
	public void setName(String name)
	{
		setX(name);
	}

	/**
	 * Gets the value of the slice
	 *
	 * @return
	 */
	public Double getValue()
	{
		return getY();
	}

	/**
	 * Sets the value of the slice
	 *
	 * @param value
	 */
	public void setValue(double value)
	{
		setY(value);
	}

}
