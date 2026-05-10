package com.jwebmp.plugins.jqplot.parts;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author GedMarc
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum YAxisTypes
{

	YAxis,
	Y2Axis;

	YAxisTypes()
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
