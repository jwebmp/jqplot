package com.jwebmp.plugins.jqplot.parts;

/**
 * @author GedMarc
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum XAxisTypes
{

	XAxis,
	X1Axis,
	X2Axis;

	XAxisTypes()
	{

	}

	/**
	 * Returns the name of the enumeration in lower case
	 * <p>
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
