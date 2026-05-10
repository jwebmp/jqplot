package com.jwebmp.plugins.jqplot.parts;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A set of all the graph axis types supported by the jqPlot plugin.
 * Some graphs are obviously retricted to a few
 * <p>
 *
 * @author GedMarc
 * @version 1.1 Update to include all 9 axis types with the change to the graph options rendering
 * @since 08 Aug 2015
 */
public enum JWGraphAxisTypes
{

	/**
	 * The X Axis
	 */
	xAxis,
	/**
	 * The xAxis-2 Axis for Dual Graph Support
	 */
	x2Axis,
	/**
	 * The yAxis axis for a graph
	 */
	yAxis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y2Axis,
	/**
	 * The zAxis Axis for a 3 dimensional graph
	 */
	zAxis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y3Axis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y4Axis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y5Axis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y6Axis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y7Axis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y8Axis,
	/**
	 * The y2Axis axis for a dual graph
	 */
	y9Axis;

	JWGraphAxisTypes()
	{

	}

	/**
	 * Returns the name of the enumeration in lower case
	 * <p>
	 *
	 * @return
	 */
	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
