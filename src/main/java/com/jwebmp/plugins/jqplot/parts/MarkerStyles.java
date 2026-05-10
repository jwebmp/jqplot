package com.jwebmp.plugins.jqplot.parts;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The available default marker styles in jqPlot
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
public enum MarkerStyles
{

	/**
	 * An Empty Circle
	 */
	Circle,
	/**
	 * An Empty Diamond
	 */
	Diamond,
	/**
	 * An Empty Square
	 */
	Square,
	/**
	 * A Filled Circle
	 */
	FilledCircle,
	/**
	 * A Filled Diamond
	 */
	FilledDiamond,
	/**
	 * A Filled Square
	 */
	FilledSquare,
	/**
	 * Draw an X
	 */
	X,
	/**
	 * Draw a Plus Sign
	 */
	Plus,
	/**
	 * Draw a Dash
	 */
	Dash;

	/**
	 * Returns the name in lower case
	 * <p>
	 *
	 * @return
	 */
	@Override
	@JsonValue
	public String toString()
	{
		return name().toLowerCase();
	}

}
